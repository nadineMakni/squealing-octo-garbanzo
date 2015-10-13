package test.dealservices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.delegate.DelegateDeal;
import edu.esprit.pidev.ClientD;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.entities.Client;
import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.interfaces.IServiceDealRemote;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;

public class TestSubscribeClientInOffre {

	public static void main(String[] args) throws NamingException {
		
		DelegateDeal delegateDeal= new DelegateDeal();
		
		ClientD client = new ClientD();
		client.setId(1);
		client.setNom("ahmed");

		Deal offreAvailable = delegateDeal.findDealById(2);

		System.out
				.println(delegateDeal.subscribeClientInOffre(client, offreAvailable));

	}

}
