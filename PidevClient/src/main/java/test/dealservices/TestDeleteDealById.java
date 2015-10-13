package test.dealservices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.delegate.DelegateDeal;
import edu.esprit.pidev.interfaces.IServiceDealRemote;

public class TestDeleteDealById {

	public static void main(String[] args) throws NamingException
	{
		// TODO Auto-generated method stub
		/*Context context = new InitialContext();
		String jndiName = "/PidevEjb/ServiceDeal!edu.esprit.pidev.interfaces.IServiceDealRemote";
		IServiceDealRemote proxy = (IServiceDealRemote) context
				.lookup(jndiName);*/
		
		DelegateDeal delegateDeal= new DelegateDeal();

		System.out.println(delegateDeal.deleteDealById(2));
	}

}
