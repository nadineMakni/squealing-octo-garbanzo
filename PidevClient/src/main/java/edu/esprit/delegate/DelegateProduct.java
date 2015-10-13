package edu.esprit.delegate;

import java.util.List;

import edu.esprit.pidev.Product;
import edu.esprit.pidev.Provider;
import edu.esprit.pidev.interfaces.IServiceProductRemote;
import edu.esprit.servicelocator.ServiceLocator;

public class DelegateProduct 
{
	static String jndi="/PidevEjb/ServiceProduct!edu.esprit.pidev.interfaces.IServiceProductRemote";
	 
	 public static IServiceProductRemote GetInstance(){
		return (IServiceProductRemote) ServiceLocator.getInstance().getProxy(jndi);
		 
	 }
	 
	 public void addProduct(Product product){
		 GetInstance().addProduct(product);
		 
	 }
	 
	 public void addProductOnProvider(Product product,Provider provider){
		 GetInstance().addProductOnProvider(product, provider);
		 
	 }
		public void deleteProductById(int id){
			GetInstance().deleteProductById(id);
		}
		public void updateProduct(Product product){
			GetInstance().updateProduct(product);
		}
		public List<Product> readAllProducts(){
			return GetInstance().readAllProducts();
			
		}
		
		public List<Product> findAllProductsByProviderId(Integer id){
			return GetInstance().findAllProductsByProviderId(id);
			
		}
		
		public Product findProductById(Integer id)
		{
			return GetInstance().findProductById(id);
		}
}
