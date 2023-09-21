package br.com.backEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "seller")
@Data
public class Vendor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idseller")
    private Integer idseller;

    @Column(name = "provider")
    private String providerSeller;

    @Column(name = "contact")
    private String contactSeller;

    @Column(name = "whatsapp")
    private Boolean whatsapp;

}
