package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Categoria;

@Repository // camada de acesso aos dados do tipo categoria
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
