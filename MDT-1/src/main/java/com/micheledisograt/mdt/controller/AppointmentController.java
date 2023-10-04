package com.micheledisograt.mdt.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micheledisograt.mdt.dto.RequestAppDTO;
import com.micheledisograt.mdt.service.AppointmentService;
import com.micheledisograt.mdt.service.RequestAppService;
import com.micheledisograt.mdt.to.RichiesteTO;


@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@Autowired
	private RequestAppService requestappService;
	

	
	
	//GETONE USER+APP
	@GetMapping("/{id}")
	public ResponseEntity<Object> findReqAppById(@PathVariable Long id){
		return new ResponseEntity<>(requestappService.findReqAppById(id),HttpStatus.OK);
	}
	
	//GET BY NAME
	@GetMapping("/name/{name}")
	public ResponseEntity<List<RequestAppDTO>> findByName(@PathVariable String name){
		List<RequestAppDTO> a = requestappService.findByName(name);
		return new ResponseEntity<List<RequestAppDTO>>(a, HttpStatus.OK);
	}
	
	//GETALL USER+APP
	@GetMapping("/all")
	public ResponseEntity<?> getAllAppUser(){
		return new ResponseEntity<>(requestappService.findAllReqApp(),HttpStatus.OK);
	}
	
	
	
	//PUT
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateApp(@PathVariable Long id, @RequestBody RichiesteTO appuntamentoto){
		
		return new ResponseEntity<>(appointmentService.updateApp(id, appuntamentoto),HttpStatus.OK);
	}
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteAppById(@PathVariable Long id){
		return new ResponseEntity<>(appointmentService.deleteAppById(id), HttpStatus.OK);
	}
	
}
