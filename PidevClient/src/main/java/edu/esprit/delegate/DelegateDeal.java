package edu.esprit.delegate;

import java.util.List;

import edu.esprit.pidev.ClientD;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.Product;
import edu.esprit.pidev.interfaces.IEmailSenderRemote;
import edu.esprit.pidev.interfaces.IServiceDealRemote;
import edu.esprit.pidev.interfaces.IServiceProductRemote;
import edu.esprit.servicelocator.ServiceLocator;

public class DelegateDeal 
{
	static String jndi="/PidevEjb/ServiceDeal!edu.esprit.pidev.interfaces.IServiceDealRemote";
	//mail
	static String jndi2 ="/PidevEjb/EmailSender!edu.esprit.pidev.interfaces.IEmailSenderRemote";
	 
	 public static IServiceDealRemote GetInstance(){
		return (IServiceDealRemote) ServiceLocator.getInstance().getProxy(jndi);
		 
	 }
	 
	 public Boolean addDeal(Deal d)
	 {
		 return GetInstance().addDeal(d);
	 }
		
	 public Boolean deleteDealById(Integer id)
	 {
		 return GetInstance().deleteDealById(id);
	 }
	 
	 public Boolean updateDeal(Deal d)
	 {
		 return GetInstance().updateDeal(d);
	 }
	 
	 public List<Deal> readAllDeals()
	 {
		 return GetInstance().readAllDeals();
	 }
	 public List<Deal> readAllSuccessfulDeals()
	 {
		 return GetInstance().readAllSuccessfulDeals();
	 }
	 public Deal findDealById(Integer id)
	 {
		 return GetInstance().findDealById(id);
	 }
	 public void enableDeal(int id)
	 {
		 GetInstance().enableDeal(id);
	 }
	 
	 public void disableDeal(int id)
	 {
		 GetInstance().disableDeal(id);
	 }
	 
	 public	Boolean creeOffreSurProduit(Product product, Deal deal)
	 {
		 return GetInstance().creeOffreSurProduit(product, deal);
	 }

	 public Boolean subscribeClientInOffre(ClientD client, Deal deal)
	 {
		 return GetInstance().subscribeClientInOffre(client, deal);
	 }

	 public List<Deal> findAllOffresByClientId(Integer id)
	 {
		 return GetInstance().findAllOffresByClientId(id);
	 }
	 
	 //mail
	 public static IEmailSenderRemote getinstance2()
	{
			return  (IEmailSenderRemote) ServiceLocator.getInstance().getProxy(jndi2);
		
	}
	 
	 public void mail()
	 {
		 String[] to ={"nadine.makni92@gmail.com"};
		 getinstance2().SendMail("oussama.rekik@esprit.tn", "tigran1993", "Secret Code" , "ajoute moi des deals de ce type", to);
	 }

}
