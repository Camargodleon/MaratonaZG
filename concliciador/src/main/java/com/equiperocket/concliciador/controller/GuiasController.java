package com.equiperocket.concliciador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equiperocket.concliciador.model.Guia;
import com.equiperocket.concliciador.persistence.GuiaPersistence;

@RestController
@RequestMapping("/guias")
public class GuiasController {

	@Autowired
	GuiaPersistence guiaPersist;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Guia>> load(){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(guiaPersist.findAll());
		
	}
	
}
