package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService stuService;
	
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getStudents() {
		return stuService.getAllStudents();
	}

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") long id) {
		return stuService.getStudentById(id);
	}
    
  //  @RequestMapping(value = "/student/{address}", method = RequestMethod.POST)
  //  public Student getStudent(@PathVariable("address") String address) {
//		return stuService.getStudentByAddress(address);
//	}
    
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(Student s) {
		return stuService.save(s);
	}

}
