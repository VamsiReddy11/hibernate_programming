 package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.module.student;

public class getAllDetails {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(student.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		//Logic
		
		Query query = session.createQuery("from student");
		
		List students= query.getResultList();
		
		for(Object s :students)
		{
			System.out.println(s);
		}
		
		transaction.commit();

	}

}
