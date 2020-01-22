package com.ustglobal.jpawithhibernateassignment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateassignment2.dto.Training;

public class Update {
	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Training training = entityManager.find(Training.class, 1);
			training.setSname("abhilash");
			System.out.println("Updated Record");
			entityTransaction.commit();
			
		}//end of try
		catch (Exception e) 
		{
			e.printStackTrace();
			entityTransaction.rollback();
		}//end of catch
		
		entityManager.close();
		
	}//end of main method
}