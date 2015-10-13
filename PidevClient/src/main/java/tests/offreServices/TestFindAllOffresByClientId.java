package tests.offreServices;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;

public class TestFindAllOffresByClientId {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/PidevEjb/OffreMarketingServices!"
				+ OffreMarketingServicesRemote.class.getCanonicalName();
		OffreMarketingServicesRemote proxy = (OffreMarketingServicesRemote) context
				.lookup(jndiName);

		List<Offre> offres = proxy.findAllOffresByClientId(1);
		for (Offre o : offres) {
			System.out.println(o.getNom());
		}

	}

}
