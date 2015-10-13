package edu.esprit.pidev.test;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pidev.Deal;
import edu.esprit.pidev.TypeDeal;
import edu.esprit.pidev.interfaces.IServiceDealRemote;

public class TestDeal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Context context;
		try 
		{
			context = new InitialContext();
			IServiceDealRemote remote;
			String appName="PidevEjb";//nom du projet EJB
			String className="ServiceDeal";
			String canNameInterface="edu.esprit.pidev.services.IServiceDeal";
			remote=(IServiceDealRemote) context.lookup("/"+appName+"/"+className+"!"+canNameInterface);
			
			Deal d=new Deal();
			Date dateFin= new Date(2017, 1, 12);
			d.setDeadline(dateFin);
			d.setDiscount(30);
			d.setIdDeal(1);
			Date dateDeb= new Date(2015, 1, 12);
			d.setStartingDate(dateDeb);
			d.setType(TypeDeal.enabled);
			
			remote.addDeal(d);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
