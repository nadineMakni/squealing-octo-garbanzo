package test.produitservices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.delegate.DelegateDeal;
import edu.esprit.delegate.DelegateProduct;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.Product;
import edu.esprit.pidev.interfaces.IServiceDealRemote;
import edu.esprit.pidev.interfaces.IServiceProductRemote;

public class TestAddProduct {

	public static void main(String[] args) throws NamingException
	{
		// TODO Auto-generated method stub
		DelegateProduct delegateProduct= new DelegateProduct();

		Product pdt1 = new Product();
		pdt1.setPaymentWay("carteBancaire");
		pdt1.setIdProduct(0);
		pdt1.setNom("produit1");
		pdt1.setPrice(100);
		pdt1.setQuantity(2);
		pdt1.setState("libre");
		
		Product pdt2 = new Product();
		pdt2.setIdProduct(1);
		pdt2.setNom("produit2");
		pdt1.setPaymentWay("carteBancaire");
		pdt1.setPrice(200);
		pdt1.setQuantity(2);
		pdt1.setState("résérvé");

		delegateProduct.addProduct(pdt1);
		delegateProduct.addProduct(pdt2);

	}

}
