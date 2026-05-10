package com.sms.app;

public class StudentService {
	
	StudentDao dao = new StudentDao();

	public void addStudent(Student s) {
		dao.addStudent(s);
	}

	public void getAllStudents() {
		dao.getAllStudents();
	}

	public void getStudentById(int id) {
		dao.getStudentById(id);
	}

	public void updateStudent(Student s) {
		dao.updateStudent(s);
	}

	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}

}
