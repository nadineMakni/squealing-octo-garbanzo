package edu.esprit.servicelocator;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator 
{
	private static ServiceLocator instance;
	public Map<String, Object> myMap;
	Context context;

	public ServiceLocator() {

		try {
			context = new InitialContext();
			myMap = new HashMap<String, Object>();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;

	}
	public Object getProxy(String jndi)
	{
		Object object;
		object=myMap.get(jndi);
		if(object==null)
		{
			try {
				object=context.lookup(jndi);
				myMap.put(jndi, object);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return object;
		
		
	}
}
