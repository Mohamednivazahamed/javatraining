package com.tcs.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
	public static void main(String[] args) {
		
		Configuration configure = new Configuration();
		configure = configure.configure();
		
		SessionFactory factory = configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session=factory.openSession();
		System.out.println(session);
		
		
//		Transaction transaction = session.beginTransaction();
//		Employee emp = new Employee();
//		emp.setEname("John Doe");
//		emp.setSal(30000);
//		session.save(emp);
//		transaction.commit();
//		
//		Transaction transaction = session.beginTransaction();
//		Investor invt = new Investor();
//		invt.setAmount(1000);
//		invt.setAddress("Udumalpet");
//		invt.setName("Kavya");
//		session.save(invt);
//		transaction.commit();
//		
//		emp.setEname("John Doe");
//		emp.setSal(30000);
//		session.save(emp);
//		transaction.commit();
		
		
		//fetch a row from DB 
//		Transaction transaction = session.beginTransaction();
//		Employee emp = session.get(Employee.class, 0);
//		
//		System.out.println(emp);
//		session.close();
		
		//Update a row from DB 
//		Transaction transaction = session.beginTransaction();
		
//		Employee emp=session.get(Employee.class, 0);
//		emp.setSal(1000000);;
//		
//		transaction.commit();
//		session.close();
		
//		Transaction transaction = session.beginTransaction();
//		Employee emp=session.get(Employee.class, 0);
//		session.delete(emp);
//		transaction.commit();
//		session.close();
//		
		
		Query<Employee> query= session.createQuery("select e from Employee e");
		List<Employee> list = query.list();
		Iterator<Employee> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		session.close();

	}

}
