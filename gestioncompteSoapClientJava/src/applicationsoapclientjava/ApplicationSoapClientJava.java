package applicationsoapclientjava;

import java.util.List;

import com.gestioncomptes.servicessoap.BanqueSoapService;
import com.gestioncomptes.servicessoap.BanqueSoapServiceService;
import com.gestioncomptes.servicessoap.Compte;
import com.gestioncomptes.servicessoap.MontantRetraitEleveException_Exception;
import com.gestioncomptes.servicessoap.Operation;
import com.gestioncomptes.servicessoap.PageOperation;

public class ApplicationSoapClientJava {

	public static void main(String[] args) throws MontantRetraitEleveException_Exception {

		BanqueSoapService stubBanqueSoapService = new BanqueSoapServiceService().getBanqueSoapServicePort();

		try {

			// effectuer un versement
			boolean resultatVersement = stubBanqueSoapService.verser("CC1", 3000, 1L);

			// effectuer un retrait
			boolean resultRetrait = stubBanqueSoapService.retirer("CC1", 300, 1L);

			// effectuer un virement
			boolean resultatVirement = stubBanqueSoapService.virement("CC1", "CC2", 200, 1L);

			// recuperer les opérations du compte "CC1" sous forme de page=0 et sizePage=0
			PageOperation pageOperation = stubBanqueSoapService.getOperation("CC1", 0, 10);
			List<Operation> operations = pageOperation.getOperations();
			for (Operation o : operations) {

				// System.out.println("codeClient :"+o.getCompte().getCodeCompte());
				System.out.println("montant :" + o.getMontant());
				System.out.println("numeroOperation :" + o.getNumeroOperation());
				System.out.println("dateOperation :" + o.getDateOperation());
				System.out.println("--------------------------");
			}

			// recupération info d'un compte données ici "CC1"
			Compte compte = stubBanqueSoapService.getCompte("CC1");
			System.out.println("codeCompte :" + compte.getCodeCompte());
			System.out.println("solde :" + compte.getSolde());
			System.out.println("dateCreation :" + compte.getDateCreation());
			System.out.println("client.codeClient :" + compte.getClient().getCodeClient());
			System.out.println("client.nomClient :" + compte.getClient().getNomClient());
			System.out.println("employe.codeEmploye: " + compte.getEmploye().getCodeEmploye());
			System.out.println("employe.nomEmploye: " + compte.getEmploye().getNomEmploye());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
