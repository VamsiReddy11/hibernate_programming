package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.module.student;

public class firstprogram {
	
	public static void main(String[] args) 
	{
		
		Configuration config = new Configuration();
		config.configure();
		
		config.addAnnotatedClass(student.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		student s1 = new student(8, "alex", "alex@gmail.com", "CE", 62);
		student s2 = new student(9, "nithish", "nithish@gmail.com", "EEE", 69);
		 
		session.save(s1);
		session.save(s2);
		transaction.commit();
	}

}