package br.com.exercicio.produtoexercicio.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;



@Entity
@Table(name = "tb_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank private String name;
	@Min(0) private double preco;
	@Min(0) @Max(1) private double desconto;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double preco, Double desconto) {
		super();
		this.name = name;
		this.preco = preco;
		this.desconto = desconto;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", preco=" + preco + ", desconto=" + desconto + "]";
	}
}
