package br.com.intensivao.dslist.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.intensivao.dslist.entities.Game;


@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	
	
	
	

}
