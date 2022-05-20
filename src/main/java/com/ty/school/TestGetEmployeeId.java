package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetEmployeeId {

	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager=entityManagerFactory.createEntityManager();
Employee employee=entityManager.find(Employee.class, 201);
if(employee !=null){
	System.out.println("employee ID: "+employee.getName());
}
else{
	System.out.println("employee details not present");
}
	}
}
