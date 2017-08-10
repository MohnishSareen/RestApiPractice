package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service("stuService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository; 

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findOne(id);
	}
	
	//@Override
	//public Student getStudentByAddress(String address) {
	//	return studentRepository.findOne(address);
	//}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public Student save(Student ss) {
		return studentRepository.save(ss);
	}

}
