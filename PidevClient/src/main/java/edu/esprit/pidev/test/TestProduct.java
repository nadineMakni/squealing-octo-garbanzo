package edu.esprit.pidev.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.pidev.Product;
import edu.esprit.pidev.interfaces.IServiceProductRemote;


public abstract class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context;
		try 
		{
			context = new InitialContext();
			IServiceProductRemote remote;
			String appName="PidevEjb";//nom du projet EJB
			String className="ServiceProduct";
			String canNameInterface="edu.esprit.pidev.services.IServiceProduct";
			remote=(IServiceProductRemote) context.lookup("/"+appName+"/"+className+"!"+canNameInterface);
			
			Product p=new Product();
			p.setPaymentWay("En ligne");
			p.setPrice(25);
			p.setQuantity(2);
			p.setState("réservé");
			//Date date= new Date(2015, 1, 15);
			remote.addProduct(p);
		} catch (NamingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
