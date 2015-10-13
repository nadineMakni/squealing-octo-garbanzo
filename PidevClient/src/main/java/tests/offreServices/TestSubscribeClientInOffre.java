package tests.offreServices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pidev.entities.Client;
import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;

public class TestSubscribeClientInOffre {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/PidevEjb/OffreMarketingServices!"
				+ OffreMarketingServicesRemote.class.getCanonicalName();
		OffreMarketingServicesRemote proxy = (OffreMarketingServicesRemote) context
				.lookup(jndiName);

		Client client = new Client();
		client.setId(1);
		client.setNom("ahmed");

		Offre offreAvailable = proxy.findOffreById(1);

		System.out
				.println(proxy.subscribeClientInOffre(client, offreAvailable));

	}

}
