package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEmploee {

	public static void main(String[] args) {
		EntityManagerFactory emp= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= emp.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Employee e= new Employee();
		e.setId(201);
		e.setName("venki");
		e.setSalary(45000.00);
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
		System.out.println("===============================done macha");
	}
}
