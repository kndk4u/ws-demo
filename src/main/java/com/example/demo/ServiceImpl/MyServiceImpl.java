package com.example.demo.ServiceImpl;

import com.example.demo.daoImpl.SampleDaoImpl;

public class MyServiceImpl {
	
	private SampleDaoImpl bauRepo;
	
	public void viewService(String msg) {
		bauRepo.view(msg);
	}
	

}
