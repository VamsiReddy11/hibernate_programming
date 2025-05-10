package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.module.student;

public class updateAll {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(student.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// logic
		
		String HQL="update student s set s.percentage = 65 where s.percentage <50";
		
		Query query = session.createQuery(HQL);
		
		int i = query.executeUpdate();
		System.out.println(i);

		transaction.commit();

	}

}
