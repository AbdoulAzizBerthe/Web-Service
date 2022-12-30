package org.example;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class Operations {
    @XmlAttribute
    private Date dateDebut;

    public Operations(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", operations=" + operations +
                '}';
    }

    public Operations(){}

    @XmlAttribute
    private Date dateFin;
    @XmlElement
     List<Operation> operations = new ArrayList<>();

    public void ajoutOperation(Operation operation){
        operations.add(operation);
    }
}

