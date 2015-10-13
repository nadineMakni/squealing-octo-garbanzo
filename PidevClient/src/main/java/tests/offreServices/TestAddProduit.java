package tests.offreServices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pidev.entities.Produit;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;

public class TestAddProduit {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		String jndiName = "/PidevEjb/OffreMarketingServices!"
				+ OffreMarketingServicesRemote.class.getCanonicalName();
		OffreMarketingServicesRemote proxy = (OffreMarketingServicesRemote) context
				.lookup(jndiName);

		Produit produit = new Produit();
		produit.setId(1);
		produit.setNom("PC");
		

		System.out.println(proxy.addProduit(produit));

	}

}
