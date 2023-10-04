package com.micheledisograt.mdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micheledisograt.mdt.service.AdminService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping ("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	//GET
	@GetMapping("/{id}")
	public ResponseEntity<Object> findAdminById(@PathVariable Long id){
		
		
		return new ResponseEntity<>(adminService.findAdminById(id),HttpStatus.OK);
	}
	
	
}
