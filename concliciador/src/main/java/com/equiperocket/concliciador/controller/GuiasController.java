package com.equiperocket.concliciador.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equiperocket.concliciador.model.Guia;
import com.equiperocket.concliciador.model.ItemGuia;
import com.equiperocket.concliciador.model.QuitacaoItem;
import com.equiperocket.concliciador.persistence.GuiaPersistence;
import com.equiperocket.concliciador.persistence.ItemGuiaPersistence;

@RestController
@RequestMapping("/guias")
public class GuiasController {

	@Autowired
	GuiaPersistence guiaPersist;
	@Autowired
	ItemGuiaPersistence itemPersist;

	@GetMapping("/lista")
	public ResponseEntity<List<Guia>> load() {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(guiaPersist.findAll());

	}

	@GetMapping("lista/{id}")
	public ResponseEntity<ItemGuia> findById(@PathVariable Long id) {
		ItemGuia itemGuia = itemPersist.findByGuiaId(id);
		if(itemGuia == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(itemGuia);

	}



}
