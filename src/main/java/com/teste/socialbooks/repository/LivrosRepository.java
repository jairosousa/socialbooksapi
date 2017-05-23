package com.teste.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
