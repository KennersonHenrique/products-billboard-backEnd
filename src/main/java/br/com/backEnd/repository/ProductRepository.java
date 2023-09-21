package br.com.backEnd.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.backEnd.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    List<Product> findAll(Specification<Product> specification);
    
  
    
}
/*
 * @Query(value = "SELECT * FROM product" , nativeQuery = true)
 * 
 * @Query(value =
 * "SELECT t FROM transactions.transferencia t WHERE t.data_transferencia BETWEEN 't.dateP' AND 't.dateS';"
 * , nativeQuery = true)
 * List<Transaction> findByDate(Date dateP,Date dateS);
 */