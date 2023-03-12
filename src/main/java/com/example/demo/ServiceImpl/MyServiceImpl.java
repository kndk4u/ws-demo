package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoImpl.SampleDaoImpl;

@Service
public class MyServiceImpl {
	
	@Autowired
	private SampleDaoImpl repo;
	
	public void myService() {
		repo.view("Hello World");
	}

}
