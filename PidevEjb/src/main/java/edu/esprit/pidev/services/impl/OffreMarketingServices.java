package edu.esprit.pidev.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.pidev.entities.Client;
import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.entities.Produit;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesLocal;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;

/**
 * Session Bean implementation class OffreMarketingServices
 */
@Stateless
public class OffreMarketingServices implements OffreMarketingServicesRemote,
		OffreMarketingServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public OffreMarketingServices() {
	}

	@Override
	public Boolean addProduit(Produit produit) {
		Boolean b = false;
		try {
			entityManager.persist(produit);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean creeOffreSurProduit(Produit produit, Offre offre) {
		Boolean b = false;
		try {
			offre.setProduit(produit);
			entityManager.merge(offre);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean subscribeClientInOffre(Client client, Offre offre) {
		Boolean b = false;
		try {
			List<Offre> offres = findAllOffresByClientId(client.getId());
			offres.add(offre);
			client.setOffres(offres);

			entityManager.merge(client);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Offre findOffreById(Integer id) {
		return entityManager.find(Offre.class, id);
	}

	@Override
	public List<Offre> findAllOffresByClientId(Integer id) {
		Client clientFound = entityManager.find(Client.class, id);
		Query query = entityManager
				.createQuery("select o from Offre o where :param member of o.clients");
		query.setParameter("param", clientFound);
		return query.getResultList();
	}

}
