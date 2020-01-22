package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetRefrence {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
//			Product product = entityManager.getReference(Product.class, 101);  // alone it will not print query
			Product product = entityManager.find(Product.class, 101); //alone it will print query
			System.out.println(product.getClass());
			
			
//			System.out.println(product.getPid());
//			System.out.println(product.getPname());
//			System.out.println(product.getQuantity());
			
			entityManager.close();
	}

}