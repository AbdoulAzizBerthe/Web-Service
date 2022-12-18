package org.example;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchema;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Banque {
    @XmlElement(name = "compte")
   public List<Compte> comptes = new ArrayList<>();

    public Banque() {
    }

    public void addComptes(Compte c1) {
        comptes.add(c1);
    }
}
