package com.example.tp13.entities;

import com.example.tp13.enums.TypeCompte;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
@XmlRootElement(name = "Compte")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data

public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Long id;

    @XmlElement(required = true)
    private Double solde;

    public Compte() {
    }

    public Compte(Long id, double solde, LocalDate dateCreation, TypeCompte type) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }


    @XmlElement(required = true)
    @Column(nullable = false)
    private LocalDate dateCreation;

    @XmlElement(required = true)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeCompte type;
}