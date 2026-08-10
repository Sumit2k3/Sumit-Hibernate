package com.hbn.learning;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hbn.learning.entity.Address;
import com.hbn.learning.entity.Employee;


public class Main {

	public static void main(String[] args) {
		
		Address add1 = new Address("Noida", "UP", 201301);
		Address add2 = new Address("Gzb", "UP", 201301);
		Address add3 = new Address("Gurgaon", "HR", 201301);
		Address add4 = new Address("Mumbai", "MH", 201301);
		
		List<Address> amitAdd = new ArrayList<>();
		amitAdd.add(add1);
		amitAdd.add(add2);
		amitAdd.add(add3);
		amitAdd.add(add4);
		
		Employee emp = new Employee();
		emp.setName("Amit");
		emp.setGender("Male");
		emp.setSalary(80000);
		emp.setAddress(amitAdd);
		
		
		// 2nd Employee
		List<Address> sonuAdd = new ArrayList<>();
		sonuAdd.add(add1);
		sonuAdd.add(add2);
		sonuAdd.add(add3);
		
		Employee emp1 = new Employee("Sonu", "Male", 70000);
		emp1.setAddress(sonuAdd);	
		
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(emp);
		session.persist(emp1);


		
		transaction.commit();
		
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		Employee employee1 = session.find(Employee.class, 2);
		System.out.println(employee1);
		System.out.println(employee1.getAddress());
		
		
		Address address = session.find(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getEmployee());
		
		
		
	}
}
