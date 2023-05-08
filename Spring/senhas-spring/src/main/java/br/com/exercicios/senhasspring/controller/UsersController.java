package br.com.exercicios.senhasspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.exercicios.senhasspring.model.Users;
import br.com.exercicios.senhasspring.repository.UsersRepository;

@RestController
@RequestMapping("/")
public class UsersController {
	
	
	//realizando a injeção de depedência
	@Autowired private UsersRepository repository;
	@Autowired private PasswordEncoder encoder;
	
	@GetMapping
	public ResponseEntity<String> msgInicial() {
		return ResponseEntity.ok("Página Inicial");
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Users>> listarTodosUsuarios(){
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<Users> salveUsers(@RequestBody Users usuario) {
		usuario.setSenha(encoder.encode(usuario.getSenha())); //passando a senha criptografada para ser armazenada no banco de dados
		return ResponseEntity.ok(repository.save(usuario));
	}
	
	@GetMapping("/validarUsuario")
	public ResponseEntity<String> validacao(
			@RequestParam String login, 
			@RequestParam String senha){
			
		//aqui será verificado se contém algum usuário com o login
		Optional<Users> optUser = repository.findByLogin(login);		
		
		if(optUser.isEmpty()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário informado não está correto!");
		}
		
		else if(encoder.matches(senha, optUser.get().getSenha())) {
			return ResponseEntity.status(HttpStatus.OK).body("Seja Bem-Vindo!");
		}
		
		else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Senha incorreta!");
		}
	}

}
