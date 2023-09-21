package br.com.backEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.backEnd.model.Product;
import br.com.backEnd.repository.ProductRepository;
import br.com.backEnd.repository.specifications.ProductSpecifications;

@CrossOrigin(maxAge = 3600)
@RestController
public class Controller {
    @Autowired
    private ProductRepository productRepository;

    
    @GetMapping("")
    public String message(){
        return "Api running";
    }


    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/list")   
    public List<Product> listAllProducts(){
        return productRepository.findAll();
    }

    @CrossOrigin("*")
    @GetMapping("/product")
    public List<Product> searchProduct(
        @RequestParam(value = "name", required = false) String productName,
        @RequestParam(value = "price", required = false) Double productPrice,
        @RequestParam(value = "vendor", required = false) String vendorName
    ){
        Specification<Product> specification = ProductSpecifications.getSpec(productName, productPrice, vendorName);
        return productRepository.findAll(specification);
        
    }

    


    }


