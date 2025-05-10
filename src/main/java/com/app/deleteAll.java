package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.module.student;

public class deleteAll {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(student.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Logic
		
		String hql = "delete from student s where s.percentage = 65";
		
		Query query = session.createQuery(hql);
		
		int i = query.executeUpdate();
		System.out.println(i);
		

		transaction.commit();

	}

}
