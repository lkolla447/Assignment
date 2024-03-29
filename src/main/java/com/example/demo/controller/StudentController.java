package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentInfo;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/studentInfo/{studentName}")
	public List<StudentInfo> getStudentInfo(@PathVariable String studentName) {
		List<StudentInfo> studentInfo = studentService.getStudentInfo(studentName);
		return studentInfo;
	}

}
