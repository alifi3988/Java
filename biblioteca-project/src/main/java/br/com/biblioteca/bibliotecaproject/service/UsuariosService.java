package br.com.biblioteca.bibliotecaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import br.com.biblioteca.bibliotecaproject.dtos.UsuariosDto;
import br.com.biblioteca.bibliotecaproject.model.Usuarios;
import br.com.biblioteca.bibliotecaproject.repository.UsuariosRepository;
import jakarta.validation.Valid;

@Service
public class UsuariosService {
	
	
	//responsavel por criar uma instancia da classe
	@Autowired
	private final UsuariosRepository repository;
	
	public UsuariosService(UsuariosRepository repository) {
		this.repository = repository;
	}
	
	//realizando a criação dos métodos de verificação
	public Boolean findByLogin(String login){
		return repository.findByLogin(login);
	}
	
	//Salvando um novo usuário
	//INSERIR ANOTAÇÃO PAR NÃO PERDER DADOS !!!
	public ResponseEntity<Boolean> save(
			@Valid UsuariosDto userDto){
		
		if(!findByLogin(userDto.getLogin())) {
			var usr = new Usuarios(userDto); //criação de uma cópia para ser salva
			//realizando o cadastro do usuário
			repository.save(usr);
			return ResponseEntity
					.status(HttpStatus.ACCEPTED)
					.body(true);
		}
		
		return ResponseEntity
				.status(HttpStatus.UNAUTHORIZED)
				.body(false);
	}
	
}
