package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Calcme;
import com.example.demo.repositories.CalcmeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CalcmeController {
	
	@Autowired
	public CalcmeRepository calcmeRepository;
	
	@RequestMapping
	public List<Calcme> getAllCalcmes(){
		return calcmeRepository.findAll(); 
	}
	
	@PostMapping 
	public String createCalcme(@RequestBody Calcme calcme ) {
		
		Calcme insertedCalcme = calcmeRepository.insert(calcme);
		
		return "Feito cadastro de "+ insertedCalcme.getNome();
	}
	
}
