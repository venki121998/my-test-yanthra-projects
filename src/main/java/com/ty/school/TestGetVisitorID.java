package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorID {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Visitor visitor=entityManager.find(Visitor.class, 101);
		if(visitor!= null){
			System.out.println("Details of employee: ");
			System.out.println("Visitor ID : "+visitor.getId());
			System.out.println("visitor Name :"+visitor.getName());
			System.out.println("visitor email :"+visitor.getEmail());
			
		}
		else{
			System.out.println("no visitor details present");
		}
	}

}
