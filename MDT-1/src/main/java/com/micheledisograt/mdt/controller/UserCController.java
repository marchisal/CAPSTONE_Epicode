package com.micheledisograt.mdt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micheledisograt.mdt.service.UserCService;
import com.micheledisograt.mdt.to.UserCTO;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/user")
public class UserCController {

	//qui sto creando un'istanza di userservice
	@Autowired
	private UserCService userService;
	
	
	//POST - requestbody: va usato nelle post e nelle put e l'utente passa in input l'obj intero
	@PostMapping("/")
	public ResponseEntity<Object> createUser(@RequestBody UserCTO userto){
		return new ResponseEntity<>(userService.createUser(userto), HttpStatus.OK);
	}
	
	//GETALL
	@GetMapping("/all")
	public ResponseEntity<Object> getAllUsers(){
		return new ResponseEntity<> (userService.getAllUsers(), HttpStatus.OK);
	}
	
	
	//GETONE - pathvariable: a patto che la richiesta abbia il parametro scelto
	@GetMapping("/{id}")
	public ResponseEntity<Object> findUserById(@PathVariable Long id){
		
		//qui chiamo il service all'interno delle tonde, mettendo l'istanza dell'interfaccia su service e dicendo la tipologia di risposta
		return new ResponseEntity<>(userService.findUserById(id),HttpStatus.OK);
	}
	
	//PUT
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateUser(@PathVariable Long id, @RequestBody UserCTO userto){
		
		return new ResponseEntity<>(userService.updateUser(id, userto),HttpStatus.OK);
	}
	
	//
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUserById(@PathVariable Long id){
		
		return new ResponseEntity<>(userService.deleteUserById(id), HttpStatus.OK);
	}
}
