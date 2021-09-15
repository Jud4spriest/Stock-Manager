package com.example.StockManager.estoque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    @Query("SELECT produto FROM Produto produto WHERE produto.id = ?1")
    Produto findByProductId(long id);

}
