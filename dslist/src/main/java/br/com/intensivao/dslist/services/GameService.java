package br.com.intensivao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intensivao.dslist.entities.Game;
import br.com.intensivao.dslist.repositorys.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	
	public List<Game> findAll(){
		return repository.findAll();		
	}
	
}
