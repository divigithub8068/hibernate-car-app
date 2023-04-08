package com.ty.car;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveReview {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Review review = new Review();
		review.setSubject("Worth for money");
		review.setContent("Usefull product. I am using since 2 years");
		review.setWriteName("prashi");
		
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
	}
}