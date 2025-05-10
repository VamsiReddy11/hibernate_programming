 package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.module.student;

public class update {

	public static void main(String[] args) {
		

		SessionFactory sessionFactory =new Configuration()
										.configure()
										.addAnnotatedClass(student.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//logic
		
		//student s = session.get(student.class, 3);
	
		//s.setPercentage(75);
		//session.update(s);
		student s = new student(7,"Singam","Singam@gmail.com","civil",98);
		
		session.saveOrUpdate(s);
		
		
		transaction.commit();
		
		
		
		
	}

}
