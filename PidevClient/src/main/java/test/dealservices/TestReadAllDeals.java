package test.dealservices;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.delegate.DelegateDeal;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.interfaces.IServiceDealRemote;


public class TestReadAllDeals {

	public static void main(String[] args) throws NamingException
	{
		// TODO Auto-generated method stub
		DelegateDeal delegateDeal= new DelegateDeal();

		List<Deal> deals = delegateDeal.readAllDeals();
		for (Deal d : deals) {
			System.out.println("Le pourcentage de remise efféctué sur le deal est "+d.getDiscount()+"La date de début du deal "+d.getStartingDate()+"La date de fin: "+d.getDeadline());
		}

	}

}
