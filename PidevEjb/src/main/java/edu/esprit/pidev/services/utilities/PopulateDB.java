package edu.esprit.pidev.services.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.pidev.Product;
import edu.esprit.pidev.Provider;

/**
 * Session Bean implementation class PopulateDB
 */
@Singleton
@LocalBean
@Startup
public class PopulateDB {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public PopulateDB() {
		// TODO Auto-generated constructor stub

	}

	@PostConstruct
	public void initDB() {
		Product product = new Product("souris", 50, 10, "online", "disponible");
		Provider provider = new Provider("Nassime");
		product.setProvider(provider);
		entityManager.merge(product);
		entityManager.merge(provider);
	}

}
