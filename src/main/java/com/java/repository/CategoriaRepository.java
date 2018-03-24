package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
