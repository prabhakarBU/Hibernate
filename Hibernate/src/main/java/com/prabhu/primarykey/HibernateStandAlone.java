package com.prabhu.primarykey;

import java.util.List;

import org.hibernate.Session;

public class HibernateStandAlone {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Student student = new Student("Prabhakar", "Sharma", "JEE");
		Address address = new Address("102 Chapin Street", "NY", "USA");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(student);
		address.setId(student.getId());
		student.setAddress(address);
		session.save(student);
		session.getTransaction().commit();
		List<Student> students = session.createQuery("from Student").list();
		for (Student s : students) {
			System.out.println("Details : " + s);
		}
		// students.forEach{System.out::println};
		session.close();

	}

}
