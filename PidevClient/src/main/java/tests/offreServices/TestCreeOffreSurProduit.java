package tests.offreServices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.entities.Produit;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;

public class TestCreeOffreSurProduit {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/PidevEjb/OffreMarketingServices!"
				+ OffreMarketingServicesRemote.class.getCanonicalName();
		OffreMarketingServicesRemote proxy = (OffreMarketingServicesRemote) context
				.lookup(jndiName);

		Produit produit = new Produit();
		produit.setId(1);
		produit.setNom("PC");

		Offre offre = new Offre();
		offre.setId(1);
		offre.setNom("à ne pas rater");

		System.out.println(proxy.creeOffreSurProduit(produit, offre));

	}

}
