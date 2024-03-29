package com.neosoft.poctask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.poctask.model.Student;
import com.neosoft.poctask.repository.HomeRepository;

@Service
public class HomeServiceImp implements HomeService {
	
	
	@Autowired
	HomeRepository hr;

	@Override
	public List<Student> listAll() {
		return (List<Student>) hr.findAll();
	}

	@Override
	public void saveAll(Student student) {
		
		hr.save(student);
		
		
	}

	@Override
	public Student get(int id) {
		
		return hr.findById(id).get();
	}

}
