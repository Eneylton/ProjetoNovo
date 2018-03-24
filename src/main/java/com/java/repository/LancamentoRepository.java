package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
