package br.com.intensivao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.intensivao.dslist.dto.GameMinDto;
import br.com.intensivao.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
	
	
	@Autowired
	private GameService service;
	
	//buscando todos os dados da table
	@GetMapping
	public List<GameMinDto> findAll(){
		//realizando a conversão e retornando do tipo GameMinDto
		return service.findAll().stream().map(x -> new GameMinDto(x)).toList();
	}

}
