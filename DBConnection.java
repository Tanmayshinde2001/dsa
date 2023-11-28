package com.training.example.backend;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBConnection {
	private DBConnection()
	{
		
	}
	
	public static EntityManager getEntityManager()
	{
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
			EntityManager em = factory.createEntityManager();
			System.out.println("Coonection succesful");
			return em;
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

}
