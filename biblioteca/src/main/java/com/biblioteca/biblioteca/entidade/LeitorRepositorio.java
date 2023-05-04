package com.biblioteca.biblioteca.entidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.biblioteca.model.Leitor;


@Repository
public interface LeitorRepositorio extends JpaRepository<Leitor, Long> {

}
