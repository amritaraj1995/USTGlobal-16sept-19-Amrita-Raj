package com.ustglobal.jpawithhibernateassignment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateassignment2.dto.Training;

public class Select {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Training traininginfo = entityManager.find(Training.class, 1);
		System.out.println("Subject Name--------"+traininginfo.getSno());
		System.out.println("Subject Name------"+traininginfo.getSname());
		System.out.println("Trainer Name--"+traininginfo.getTrainername());
		System.out.println("Days------"+traininginfo.getDays());
		entityManager.close();
	}

}
