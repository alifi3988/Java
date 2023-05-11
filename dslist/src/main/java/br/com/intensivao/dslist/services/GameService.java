package br.com.intensivao.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.intensivao.dslist.dto.GameDto;
import br.com.intensivao.dslist.dto.GameMinDto;
import br.com.intensivao.dslist.repositorys.GameRepository;
import jakarta.transaction.Transactional;


@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	
	public List<GameMinDto> findAll(){
		return repository.findAll().stream().map(x -> new GameMinDto(x)).toList();		
	}
	
	@Transactional
	public GameDto findById(Long id) {
		System.out.println("ID: " + id);
		var game = repository.findById(id).get();
		System.out.println(game.toString());
		return new GameDto(game);
	}
	
}
