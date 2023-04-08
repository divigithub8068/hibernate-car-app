package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveUser {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = new User();
		user.setName("Prashi");
		user.setEmail("prashi@gmail.com");
		user.setPassword("Prashi123");
		user.setGender("Male");

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}
}
