package test.dealservices;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.delegate.DelegateDeal;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.Product;
import edu.esprit.pidev.TypeDeal;
import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.entities.Produit;
import edu.esprit.pidev.interfaces.IServiceDealRemote;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;


public class TestAddDealOnProduct 
{

	public static void main(String[] args) throws NamingException
	{
		// TODO Auto-generated method stub
		
		/*Context context = new InitialContext();
		String jndiName = "/PidevEjb/ServiceDeal!"
				+ IServiceDealRemote.class.getCanonicalName();
		IServiceDealRemote proxy = (IServiceDealRemote) context
				.lookup(jndiName);*/

		DelegateDeal delegateDeal= new DelegateDeal();
		
		Date dateDeb= new Date(15, 1, 1);
		Date dateFin= new Date(15, 12, 1);
		Product product = new Product();
		product.setIdProduct(2);
		product.setNom("produit2");
		product.setPaymentWay("carte Bancaire");
		product.setPrice(100);
		product.setQuantity(7);
		product.setState("dispo");

		Deal deal = new Deal();
		deal.setIdDeal(3);
		deal.setDeadline(dateFin);
		deal.setDiscount(20);
		deal.setStartingDate(dateDeb);
		deal.setType(TypeDeal.waiting);
		deal.setNoteClient(8);
		
		delegateDeal.creeOffreSurProduit(product, deal);
	}

}
