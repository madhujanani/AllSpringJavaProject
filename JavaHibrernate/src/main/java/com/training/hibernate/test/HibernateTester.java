package com.training.hibernate.test;

import java.util.List;

import com.training.hibernate.dao.StudentDao;
import com.training.hibernate.entity.Student;

public class HibernateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao = new StudentDao();
		Student stud = new Student("Sunil","Rao","srao@gmail.com");
		//Student stud = new Student("Maya","varun","mvar.gmail.com");
		//Student stud = new Student("David","Raj","davraj.gmail.com");

		
		studentDao.saveStudent(stud);
		
		List<Student> studList =studentDao.getStudent();
		for(Student student :studList) {
			System.out.println(student.getFirstName()+"  : "+student.getLastName());
		}
		}
		
		
	}


