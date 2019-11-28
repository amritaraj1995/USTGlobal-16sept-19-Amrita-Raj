package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class TestDemo {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setPid(104);
		product.setPname("Eraser");
		product.setQuantity(7);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("Record saved");
		entityTransaction.commit();
		entityManager.close();
	}//end of main method

}//end of TestDemo
