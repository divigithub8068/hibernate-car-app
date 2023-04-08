package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllar {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "Select c from Car c where c.brand = ?1 and c.type = ?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "TATA");
		query.setParameter(2, "Petrol");

		List<Car> list = query.getResultList();

		if (list.size() > 0) {
			for (Car car : list) {
				System.out.println("ID: " + car.getId());
				System.out.println("Name: " + car.getName());
				System.out.println("Brand: " + car.getBrand());
				System.out.println("Type: " + car.getType());
				System.out.println("Cost: " + car.getCost());
			}
		} else {
			System.out.println("Car your are looking for is not avalilable");
		}
	}
}
