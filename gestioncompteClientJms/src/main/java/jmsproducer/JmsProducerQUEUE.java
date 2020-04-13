package jmsproducer;

import java.util.Scanner;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsProducerQUEUE {

	
	public static void main(String[] args) {

		try {
			// Create connectionFactory ( interface )
			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
			
			// Create Connection
			Connection connection = connectionFactory.createConnection();
			
			connection.start();
			
	        // Create a session ( False = �gale non transaction )
			Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
			
			// Create the destination ( Topic or Queue). Si elle n'existe pas demande la cr�ation
			Destination destination = session.createQueue("clientJmsToServerSpring");
			
			//Create a MessageProducer from the session to the Topic or Queue
			MessageProducer messageProducer = session.createProducer(destination) ;
			
			// NON_PERSISTENT delete message after delevery
		    messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
		    
		    
		    		    //--------------------------------------------

			// saisir le nom du Client a ajouter
			Scanner scanner = new Scanner(System.in);
			System.out.print("Client? (or type exit):  ");

			String client;

			while ((client = scanner.nextLine()) != "exit") {

				// Create message
				TextMessage textMessage = session.createTextMessage(client);


				// Tell the producer to send the message
				messageProducer.send(textMessage);

				System.out.println("I am Poducer. Message sent is : " + client  );

				System.out.print("Client? (or type exit):  ");  
		    
			}
		    

		    // Clean up
		    messageProducer.close();
		    connection.close();
		    		    
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
