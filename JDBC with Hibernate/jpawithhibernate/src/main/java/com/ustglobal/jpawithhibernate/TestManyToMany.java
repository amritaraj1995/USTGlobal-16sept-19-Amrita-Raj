package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Course;
import com.ustglobal.jpawithhibernate.manytomany.Student;

public class TestManyToMany {
	
	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setCid(10);
		course1.setCname("JAVA");
		
		Course course2 = new Course();
		course2.setCid(20);
		course2.setCname("SQL");
		
		ArrayList<Course> alCourses = new ArrayList<Course>();
		alCourses.add(course1);
		alCourses.add(course2);
		
		
		Student student = new Student();
		student.setSid(1);
		student.setSname("Rahul");
		student.setCourse(alCourses);
		

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record saved");
		
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			//entityTransaction.rollback();
		}
		entityManager.close();
	}//end of main method

}
