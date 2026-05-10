package com.sms.app;

public class StudentController {
	
	StudentService service = new StudentService();

	public void addStudent(Student s) {
		service.addStudent(s);
	}

	public void getAllStudents() {
		service.getAllStudents();
	}

	public void getStudentById(int id) {
		service.getStudentById(id);
	}

	public void updateStudent(Student s) {
		service.updateStudent(s);
	}

	public void deleteStudent(int id) {
		service.deleteStudent(id);
	}

}
