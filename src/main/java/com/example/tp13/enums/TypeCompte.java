package com.example.tp13.enums;


import jakarta.xml.bind.annotation.XmlEnumValue;

public enum TypeCompte {
    @XmlEnumValue("COURANT") COURANT,
    @XmlEnumValue("EPARGNE") EPARGNE
}
