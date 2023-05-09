package br.com.biblioteca.bibliotecaproject.dtos;

import org.springframework.stereotype.Component;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Component
public class UsuariosDto {
	
	@NotBlank
	@Size(min = 3, max = 255)
	private String nome;
	
	@NotBlank
	@Size(min = 3, max = 255)
	private String login;
	
	@NotBlank
	@Size(min = 8, max = 255)
	private String senha;
	
	public UsuariosDto() {}

	public UsuariosDto(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
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
		return "UsuariosDto [nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}

}
