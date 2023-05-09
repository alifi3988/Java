package br.com.biblioteca.bibliotecaproject.model;

import java.util.UUID;
import br.com.biblioteca.bibliotecaproject.dtos.UsuariosDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(nullable = false, length = 50)
	private String login;
	@Column(nullable = false, length = 50)
	private String senha;
	
	public Usuarios() {}

	public Usuarios(UsuariosDto usrDto) {
		setNome(usrDto.getNome());
		setLogin(usrDto.getLogin());
		setSenha(usrDto.getSenha());
	}

	//MÉTODOS GETTs E SETTs	
	public String getNome() {
		return nome;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}
	
}
