package com;

import com.controller.StudentController;
import com.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAop {
	public static void main(String[] args) {
		ConfigurableApplicationContext cat = SpringApplication.run(SpringBootAop.class);
		StudentController sc = cat.getBean(StudentController.class);
		Student st = (Student)sc.addStudents(1, "Shiva", "ST. Lawrence");

	}
}
