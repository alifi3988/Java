package br.com.exercicio.produtoexercicio.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.exercicio.produtoexercicio.models.Product;
import br.com.exercicio.produtoexercicio.repositories.ProdutoRepositorie;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class ProductController {
	
	//realizando a injeção de dependência
	@Autowired //ele vai colocar automaticamente colocar um Objeto dentro de repository do tipo ProdutoRepositorie
	private ProdutoRepositorie repository;
	
	//mensagem inicial	
	@GetMapping
	public String msg() {
		return "Página Inicial";
	}
	
	//inserção de produtos
	@PostMapping("/inserir")
	//@RequestMapping(method = {RequestMethod.PUT, RequestMethod.POST}) // aqui ele pode fazer os dois PUT e POST
	public @ResponseBody Product saveProduct(@Valid Product produto) {
		repository.save(produto);
		return produto;
	}
	
	//realizando a recuperação de produtos
	@GetMapping("/RecProdutos")
	public List<Product> recuperarProdutos() {
		return repository.findAll();
	}
	
	//realizando a buscar pelo ID
	@GetMapping(path = "/RecProdutos/id/{id}")
	public Optional<Product> obterProdutoPorId(@PathVariable Long id){
		return repository.findById(id);
	}
	
	//Atualização / Alteração de produto
	@PutMapping
	public Product alterarProduto(@Valid Product produtoNovo) {
		return repository.save(produtoNovo);
	}
	
	//deletando o produto
	@DeleteMapping(path = "/{id}")
	public String excluirProduto(@PathVariable Long id) {
		var p = repository.findById(id);
		repository.deleteById(id);
		return "Produto Deletado: " + p.toString(); //retornando informação do produto
	}
	
	//retornando em formato de páginas
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Product> obterPordutosPorPag(@PathVariable int numeroPagina){
		Pageable page = PageRequest.of(0,3);
		return repository.findAll();
	}
	
	//pesquisa por palavras (nome)
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Product> obterProdutoPorNome(@PathVariable String parteNome){
		//return repository.findByNameContaining(parteNome);
		return repository.searchByNameLike(parteNome);
	}
	
	
}
