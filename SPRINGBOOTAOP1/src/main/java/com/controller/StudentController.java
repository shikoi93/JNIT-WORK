package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/add/student", method = RequestMethod.GET)
	public Student addStudents(@RequestParam("sid") int sid, @RequestParam("name") String name, @RequestParam("college") String college) {

		return studentService.createStudents(sid,name,college);

	}



}