package br.com.exercicios.senhasspring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exercicios.senhasspring.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	
	public Optional<Users> findByLogin(String login);
	
	
    
}
