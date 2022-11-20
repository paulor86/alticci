package com.alticci.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alticci.entity.AlticciEntity;
import com.alticci.service.AlticciService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/alticci")
@Api(value = "Api para cálculo Alticci")
public class AlticciController {

	@Autowired
	public AlticciService alticciService;

	@ApiOperation(value = "Encontra todos os valores calculados com os indices inseridos")
	@GetMapping
	public List<AlticciEntity> findAllValueAlticci() {
		List<AlticciEntity> listValue = new ArrayList<>();
		listValue.addAll(alticciService.findAllValueAlticci());
		return listValue;
	}

	@ApiOperation(value = "Encontra um calculo através do indice indicado")
	@GetMapping(value = "/{index}")
	public ResponseEntity<AlticciEntity> findValueAlticci(@PathVariable Long index) {
		AlticciEntity entity = alticciService.findValueAlticci(index);
		return ResponseEntity.ok().body(entity);
	}

	@ApiOperation(value = "Inseri um index para realizar um cálculo e salvar o valoro")
	@PostMapping
	public ResponseEntity<AlticciEntity> saveValueAlticci(@RequestBody AlticciEntity entity) {
		return ResponseEntity.ok().body(alticciService.saveValueAlticci(entity));
	}
}
