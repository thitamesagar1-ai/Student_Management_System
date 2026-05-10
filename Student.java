package com.sms.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String course;
	private int age;
	private String city;

	public Student() {

	}

	public Student(int id, String name, String course, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", " + "name=" + name + "," + " course=" + course + ", " + "age=" + age + ","
				+ "city=" + city + "]";
	}

}
