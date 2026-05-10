package com.sms.app;

import java.util.Scanner;

public class StudentManagementSystemApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		StudentController controller = new StudentController();

		while (true) {

			System.out.println("\n===== Student Management System =====");

			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Get Student By ID");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");

			System.out.print("Enter Choice : ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.print("Enter ID : ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Name : ");
				String name = sc.nextLine();

				System.out.print("Enter Course : ");
				String course = sc.nextLine();

				System.out.print("Enter Age : ");
				int age = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter City : ");
				String city = sc.nextLine();

				Student s = new Student(id, name, course, age, city);

				controller.addStudent(s);

				break;

			case 2:

				controller.getAllStudents();

				break;

			case 3:

				System.out.print("Enter Student ID : ");
				int sid = sc.nextInt();

				controller.getStudentById(sid);

				break;

			case 4:

				System.out.print("Enter ID : ");
				int uid = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter New Name : ");
				String uname = sc.nextLine();

				System.out.print("Enter New Course : ");
				String ucourse = sc.nextLine();

				System.out.print("Enter New Age : ");
				int uage = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter New City : ");
				String ucity = sc.nextLine();

				Student us = new Student(uid, uname, ucourse, uage, ucity);

				controller.updateStudent(us);

				break;

			case 5:

				System.out.print("Enter Student ID : ");
				int did = sc.nextInt();

				controller.deleteStudent(did);

				break;

			case 6:

				System.out.println("Thank You...");
				System.exit(0);

			default:

				System.out.println("Invalid Choice...");
			}
		}

	}

}
