package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCar {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Car car = new Car();
		car.setName("Nano");
		car.setBrand("TATA");
		car.setCost(200000.659);
		car.setType("Petrol");

		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
	}
}
