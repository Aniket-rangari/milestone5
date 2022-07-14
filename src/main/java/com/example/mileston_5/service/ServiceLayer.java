package com.example.mileston_5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mileston_5.entity.ElectronicDevice;
import com.example.mileston_5.repo.Repo;

@Service
public class ServiceLayer {
	
	@Autowired
	private Repo repository;
	
	
	public ElectronicDevice addElectronicDevice(ElectronicDevice e) {
		return repository.save(e);	
	}
	
	public List<ElectronicDevice> getAllDevice(){
		return repository.findAll();
	}
	
	public ElectronicDevice getOneDevice(int id) {
		return repository.findById(id).orElse(null);	
	}
}
