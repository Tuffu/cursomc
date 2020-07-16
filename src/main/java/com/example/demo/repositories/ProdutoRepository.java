package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Produto;

@Repository // camada de acesso aos dados do tipo produto
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
