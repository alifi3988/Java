package br.com.biblioteca.bibliotecaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.bibliotecaproject.service.UsuariosService;

@RestController
@RequestMapping("/")
public class UsuariosController {
	
	@Autowired
	private final UsuariosService usuariosService;
	
	
	public UsuariosController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	//realizando a inserção de usuário
	@PostMapping(value = "/save")
	
	
	
	 
	
	
	
	

}
