package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavetheParent {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	Parent parent= new Parent();
	parent.setName("venki");
	parent.setEmail("venki@gmail");
	parent.setPhoneno(90081850);
	entityTransaction.begin();
	entityManager.persist(parent);
	entityTransaction.commit();
}
	

}
