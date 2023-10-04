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

import com.micheledisograt.mdt.dto.RequestPrevDTO;
import com.micheledisograt.mdt.service.QuoteService;
import com.micheledisograt.mdt.service.RequestPrevService;
import com.micheledisograt.mdt.to.RichiesteTO;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/quote")
public class QuoteController {
	
	@Autowired
	private QuoteService quoteService;
	
	@Autowired
	private RequestPrevService requestprevService;
	
	
	
	//GETONE USER+PREV
	@GetMapping("/{id}")
	public ResponseEntity<Object> findReqPrevById(@PathVariable Long id){
		return new ResponseEntity<>(requestprevService.findReqPrevById(id),HttpStatus.OK);
	}
	
	//GET BY NAME
	@GetMapping("/name/{name}")
	public ResponseEntity<List<RequestPrevDTO>> findByName(@PathVariable String name){
		List<RequestPrevDTO> q = requestprevService.findByName(name);
		return new ResponseEntity<List<RequestPrevDTO>>(q, HttpStatus.OK);
	}
	
	//GETALL USER+PREV
	@GetMapping("/all")
	public ResponseEntity<?> getAllQuoteUser(){
		return new ResponseEntity<>(requestprevService.findAllReqPrev(),HttpStatus.OK);
	}
	
	
	//PUT
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateQuote(@PathVariable Long id, @RequestBody RichiesteTO quoteto){
		return new ResponseEntity<>(quoteService.updateQuote(id, quoteto),HttpStatus.OK);
	}
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteQuoteById(@PathVariable Long id){
		return new ResponseEntity<>(quoteService.deleteQuoteById(id),HttpStatus.OK);
	}

}
