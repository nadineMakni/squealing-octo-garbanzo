package edu.esprit.pidev.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pidev.ClientD;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.Product;
import edu.esprit.pidev.entities.Client;
import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.entities.Produit;

@Remote
public interface IServiceDealRemote
{
	Boolean addDeal(Deal d);

	Boolean deleteDealById(Integer id);

	Boolean updateDeal(Deal d);

	List<Deal> readAllDeals();
	
	List<Deal> readAllSuccessfulDeals();

	Deal findDealById(Integer id);
	
	void enableDeal(int id);
	
	void disableDeal(int id);

	Boolean creeOffreSurProduit(Product product, Deal deal);

	Boolean subscribeClientInOffre(ClientD client, Deal deal);

	List<Deal> findAllOffresByClientId(Integer id);
}
