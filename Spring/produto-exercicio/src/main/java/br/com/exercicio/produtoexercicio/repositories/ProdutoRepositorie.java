package br.com.exercicio.produtoexercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.exercicio.produtoexercicio.models.Product;

@Repository
public interface ProdutoRepositorie extends JpaRepository<Product, Long>{
	
	
	//a baixo tem dois modos de realizar o mesmo procedimento
	public Iterable<Product> findByNameContaining(String name);
	
	@Query("SELECT p FROM Product p WHERE p.name LIKE %:name%")
	public Iterable<Product> searchByNameLike(@Param("name") String name);

}
