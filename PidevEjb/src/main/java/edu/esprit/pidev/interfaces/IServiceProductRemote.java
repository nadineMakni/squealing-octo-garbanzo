package edu.esprit.pidev.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.pidev.Deal;
import edu.esprit.pidev.Product;
import edu.esprit.pidev.Provider;

@Remote
public interface IServiceProductRemote
{
	Boolean addProduct(Product pdt);
	
	Boolean addProductOnProvider(Product product,Provider provider);

	Boolean deleteProductById(Integer id);

	Boolean updateProduct(Product pdt);

	List<Product> readAllProducts();
	
	List<Product> findAllProductsByProviderId(Integer id);

	Product findProductById(Integer id);
}
