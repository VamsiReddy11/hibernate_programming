package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.module.student;

public class getdetails {
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration()
										.configure()
										.addAnnotatedClass(student.class)
				                        .buildSessionFactory();
		
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();

		//Logic
		student student = session.get(student.class, 3);
		System.out.println(student);
		

		transaction.commit();
	}

}
