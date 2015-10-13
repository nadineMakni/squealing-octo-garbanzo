package test.dealservices;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.delegate.DelegateDeal;
import edu.esprit.pidev.Deal;
import edu.esprit.pidev.entities.Offre;
import edu.esprit.pidev.interfaces.IServiceDealRemote;
import edu.esprit.pidev.services.interfaces.OffreMarketingServicesRemote;

public class TestFindAllDealsByClientId 
{
	public static void main(String[] args) throws NamingException {
		DelegateDeal delegateDeal= new DelegateDeal();

		List<Deal> deals = delegateDeal.findAllOffresByClientId(1);
		for (Deal d : deals) {
			System.out.println(d.getType());
		}

	}
}
