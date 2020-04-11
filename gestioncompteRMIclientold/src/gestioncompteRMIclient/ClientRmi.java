package gestioncompteRMIclient;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.entities.Operation;
import com.gestioncomptes.metier.PageOperation;
import com.gestioncomptes.servicermi.IBanqueRmiService;

public class ClientRmi {

	public static void main(String[] args) {

		try {
			// IBanqueRmiService stubBanqueRmiServiceClient = (IBanqueRmiService)
			// Naming.lookup("rmi://localhost:1099/BanqueRMi");

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
					gestioncompteRMIclient.techn.ServiceRmiClientConfig.class);

			IBanqueRmiService stubBanqueRmiServiceClient = context.getBean(IBanqueRmiService.class);

			// effectuer un versement
			boolean resultatVersement = stubBanqueRmiServiceClient.verser("CC1", 3000, 1L);

			// effectuer un retrait
			boolean resultRetrait = stubBanqueRmiServiceClient.retirer("CC1", 300, 1L);

			// effectuer un virement
			boolean resultatVirement = stubBanqueRmiServiceClient.virement("CC1", "CC2", 200, 1L);

			// recuperer les opérations du compte "CC1" sous forme de page=0 et sizePage=0
			PageOperation pageOperation = stubBanqueRmiServiceClient.getOperation("CC1", 0, 10);
			List<Operation> operations = pageOperation.getOperations();
			for (com.gestioncomptes.entities.Operation o : operations) {

				// System.out.println("codeClient :"+o.getCompte().getCodeCompte());
				System.out.println("montant :" + o.getMontant());
				System.out.println("numeroOperation :" + o.getNumeroOperation());
				System.out.println("dateOperation :" + o.getDateOperation());
				System.out.println("--------------------------");
			}

			// recupération info d'un compte données ici "CC1"
			Compte compte = stubBanqueRmiServiceClient.getCompte("CC1");
			System.out.println("codeCompte :" + compte.getCodeCompte());
			System.out.println("solde :" + compte.getSolde());
			System.out.println("dateCreation :" + compte.getDateCreation());
			System.out.println("client.codeClient :" + compte.getClient().getCodeClient());
			System.out.println("client.nomClient :" + compte.getClient().getNomClient());
			System.out.println("employe.codeEmploye: " + compte.getEmploye().getCodeEmploye());
			System.out.println("employe.nomEmploye: " + compte.getEmploye().getNomEmploye());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
