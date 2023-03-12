package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoImpl.SampleDaoImpl;

@Service
public class MyServiceImpl {
	
	@Autowired
	private SampleDaoImpl repo;
	
	public void myService() {
		repo.printDisplay("Hello World");
	}

}
