package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
