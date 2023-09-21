package br.com.backEnd.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.backEnd.model.Vendor;


@Repository
public interface SellerRepository extends JpaRepository<Vendor, Integer>{
    List<Vendor> findAll(Specification<Vendor> specification);
}