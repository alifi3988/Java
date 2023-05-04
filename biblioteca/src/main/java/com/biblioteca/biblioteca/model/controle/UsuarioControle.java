package com.biblioteca.biblioteca.model.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.biblioteca.entidade.UsuarioRepositorio;
import com.biblioteca.biblioteca.model.Usuario;

@RestController
public class UsuarioControle {
	
	@Autowired
	private UsuarioRepositorio repositoryUsr;
	
	
	//método para pegar todos os usuários cadastrados. No caso vai retornar uma lista de usuários
	//O correto é colocar um limitador para não dar ruim kk
	@RequestMapping("/usuarios")
	public List<Usuario> findAll(){
		return repositoryUsr.findAll();
	}
	
	
	//método para retornar somente um usuário, no caso com o ID expecificado
	@SuppressWarnings({ "deprecation" })
	@RequestMapping("/usuario/{id}")
	public Usuario findById(Long id) {
		return repositoryUsr.getById(id);
	}
	

}
