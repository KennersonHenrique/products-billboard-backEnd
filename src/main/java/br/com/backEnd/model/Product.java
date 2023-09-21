package br.com.backEnd.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idproducts")
    private Integer idProduct;

    @Column(name = "name")
    private String nameProduct;

    @Column(name = "priceproducts")
    private Double priceProduct;

    @Column(name = "descr")
    private String descrProduct;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor", referencedColumnName = "idseller")
    private Vendor vendor;
}
