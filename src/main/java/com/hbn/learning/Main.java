package com.hbn.learning;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.learning.entity.Employee;


public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		
		//FROM Clause
//		Query query = session.createQuery("from Employee1", Employee.class);
//		System.out.println(query.list());
		
		//AS Clause
//		Query query = session.createQuery("from Employee1 AS e", Employee.class);
//		System.out.println(query.list());
		
		//SELECT Clause
//		Query query = session.createQuery("SELECT e.name FROM Employee1 e", String.class);
//		System.out.println(query.list());
		
		//WHERE Clause
//		Query query = session.createQuery("from Employee1 e where e.id=2", Employee.class);
//		System.out.println(query.list());
		
		//ORDER BY
		Query query = session.createQuery("FROM Employee1 e ORDER BY e.name, e.salary DESC", Employee.class);
		System.out.println(query.list());
		
		
		//DELETE Query
//		MutationQuery query = session.createMutationQuery("DELETE FROM Employee1 e WHERE e.id=:id");
//		query.setParameter("id", 2);
//		
//		int delete = query.executeUpdate();
//				
//		transaction.commit();
//		System.out.println(delete);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		------------------------find() And load()-----------------------------

//		System.out.println(session.find(Employee.class, 22));
		
//		session.load(emp1, 22);
//		System.out.println(emp1);

	}
}
