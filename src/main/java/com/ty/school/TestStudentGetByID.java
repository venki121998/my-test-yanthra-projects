package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestStudentGetByID {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Student	Student =entityManager.find(Student.class, 1);
		System.out.println("student details are: ");
		System.out.println("id is: "+ Student.getId());
		System.out.println("Name is: "+Student.getName());
		System.out.println("Percentage is: "+ Student.getPercentage());
	}
}
