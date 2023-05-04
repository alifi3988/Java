package com.biblioteca.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livros")
public class Livro {
	
	@Id
	@Column(name = "id_livro")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = false)
    private String nome;
	
	@Column(nullable = false)
    private String autor;
	
	@Column(nullable = false)
    private String editora;
	
	@Column(nullable = false)
    private String dataEntrada;
	
	@Column(nullable = false)
    private String genero;
	
	@Column(nullable = false)
    private boolean status;
	
	@Column(nullable = false)
    private String corredor;
	
	@Column(nullable = false)
    private String pratilheira;
	
	@Column(nullable = false)
    private String setor;

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCorredor() {
		return corredor;
	}

	public void setCorredor(String corredor) {
		this.corredor = corredor;
	}

	public String getPratilheira() {
		return pratilheira;
	}

	public void setPratilheira(String pratilheira) {
		this.pratilheira = pratilheira;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", autor=" + autor + ", editora=" + editora + ", dataEntrada="
				+ dataEntrada + ", genero=" + genero + ", status=" + status + ", corredor=" + corredor
				+ ", pratilheira=" + pratilheira + ", setor=" + setor + "]";
	}
	
	
}
