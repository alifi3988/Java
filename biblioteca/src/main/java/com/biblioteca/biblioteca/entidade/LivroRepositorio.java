package com.biblioteca.biblioteca.entidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.model.Livro;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Long> {

}
