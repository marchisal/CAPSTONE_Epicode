package com.micheledisograt.mdt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micheledisograt.mdt.service.RichiesteService;
import com.micheledisograt.mdt.to.RichiesteTO;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/richieste")
public class RichiesteController {
	
	@Autowired
	private RichiesteService richiesteService;
	
	@PostMapping("/appointment")
	public ResponseEntity<Object> createRichiestaApp(@RequestBody RichiesteTO richiesteto){
		return new ResponseEntity<>(richiesteService.createRichiestaApp(richiesteto), HttpStatus.OK);
	}
	
	@PostMapping("/quote")
	public ResponseEntity<Object> createRichiestaPrev(@RequestBody RichiesteTO richiesteto){
		return new ResponseEntity<>(richiesteService.createRichiestaPrev(richiesteto), HttpStatus.OK);
	}
}
