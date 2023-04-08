package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestValidateUser {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "Select u from User u where u.email = ?1 and u.password = ?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "prashi@gmail.com");
		query.setParameter(2, "Prashi123");

		List<User> list = query.getResultList();

		if (list.size() > 0) {
			for (User user : list) {
				System.out.println("ID: " + user.getId());
				System.out.println("Name: " + user.getName());
				System.out.println("Email: " + user.getEmail());
				System.out.println("Gender: " + user.getGender());
			}
		} else {
			System.out.println("Email and password is wrong or does not exist");
		}
	}
}
