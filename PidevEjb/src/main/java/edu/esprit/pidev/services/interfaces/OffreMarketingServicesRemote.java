package edu.esprit.pidev.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pidev.entities.Client;
import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.entities.Produit;

@Remote
public interface OffreMarketingServicesRemote {
	Boolean addProduit(Produit produit);

	Boolean creeOffreSurProduit(Produit produit, Offre offre);

	Boolean subscribeClientInOffre(Client client, Offre offre);

	Offre findOffreById(Integer id);

	List<Offre> findAllOffresByClientId(Integer id);

}
