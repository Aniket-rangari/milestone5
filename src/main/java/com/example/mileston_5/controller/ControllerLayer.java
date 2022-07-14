package com.example.mileston_5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mileston_5.entity.ElectronicDevice;
import com.example.mileston_5.service.ServiceLayer;

@RestController
public class ControllerLayer {
	
	@Autowired
	private ServiceLayer service;
	
	@PostMapping("/electronics")
	public ElectronicDevice addDevice(@RequestBody ElectronicDevice e) {
		return service.addElectronicDevice(e);	
	}
	
	@GetMapping("/electronics/{id}")
	public ElectronicDevice getById(@PathVariable int id) {
		return service.getOneDevice(id);	
	}
	
	@GetMapping("/electronics")
	public List<ElectronicDevice> getAllDevice(){
		return service.getAllDevice();	
	}
}
