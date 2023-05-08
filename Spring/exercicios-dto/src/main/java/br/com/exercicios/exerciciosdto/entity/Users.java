package br.com.exercicios.exerciciosdto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String pss;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	public Users( String name, String pss) {
		super();
		this.name = name;
		this.pss = pss;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPss() {
		return pss;
	}


	public void setPss(String pss) {
		this.pss = pss;
	}
	
	

}
