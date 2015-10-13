package test.dealservices;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.delegate.DelegateDeal;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.interfaces.IServiceDealRemote;


public class TestUpdateDeal {

	public static void main(String[] args) throws NamingException
	{
		// TODO Auto-generated method stub
		DelegateDeal delegateDeal= new DelegateDeal();

		Deal dealFound = delegateDeal.findDealById(2);

		dealFound.setDiscount(80);

		System.out.println(delegateDeal.updateDeal(dealFound));

	}

}
