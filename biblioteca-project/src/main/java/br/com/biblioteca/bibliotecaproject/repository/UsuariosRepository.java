package br.com.biblioteca.bibliotecaproject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.biblioteca.bibliotecaproject.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, UUID>{
	
	///verificações para ser implementadas
	
	//verificação do usuário se ja tem algum no banco de dados
	public Boolean findByLogin(String usuario);
}
