package com.sms.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDao {

	SessionFactory sf = HibernateConfig.getSessionFactory();

	
	public void addStudent(Student s) {

		System.out.println("***** Insert Student ******");
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(s);

		tx.commit();

		session.close();

		System.out.println("Student Added Successfully...");
	}

	
	public void getAllStudents() {

		System.out.println("***** Get All Students  ******");
		Session session = sf.openSession();

		List<Student> list = session.createQuery("from Student", Student.class).list();

		for (Student s : list) {
			System.out.println(s);
		}

		session.close();
	}

	
	public void getStudentById(int id) {
 
		System.out.println("***** Get Student By ID ******");
		Session session = sf.openSession();

		Student s = session.get(Student.class, id);

		if (s != null) {
			System.out.println(s);
		} else {
			System.out.println("Student Not Found...");
		}

		session.close();
	}

	
	public void updateStudent(Student s) {

		System.out.println("***** Update Student ******");
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.update(s);

		tx.commit();

		session.close();

		System.out.println("Student Updated Successfully...");
	}

	
	public void deleteStudent(int id) {

		System.out.println("***** Delete Student ******");
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Student s = session.get(Student.class, id);

		if (s != null) {

			session.delete(s);

			tx.commit();

			System.out.println("Student Deleted Successfully...");
		} else {
			System.out.println("Student Not Found...");
		}

		session.close();
	}
}
