package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;


public class TestManyToOne {
	
	public static void main(String[] args) {

		PencilBox pencilBox = new PencilBox();
		pencilBox.setBid(2);
		pencilBox.setBname("BenTen");

		Pencil pencil1 = new Pencil();
		pencil1.setPid(13);
		pencil1.setName("SakaLakaBoomBoom");
		pencil1.setPencilBox(pencilBox);
		
		Pencil pencil2 = new Pencil();
		pencil2.setPid(12);
		pencil2.setName("Natraj");
		pencil2.setPencilBox(pencilBox);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(pencil1);
			entityManager.persist(pencil2);
			
			System.out.println("Record saved");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}//end of main method

}