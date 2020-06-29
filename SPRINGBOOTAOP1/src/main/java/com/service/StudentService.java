package com.service;

import com.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public Student createStudents(int sid, String name, String college)
	{
		Student student= new Student();
		student.setSid(sid);
		student.setName(name);
		student.setCollege(college);

		return student;
	}

}
