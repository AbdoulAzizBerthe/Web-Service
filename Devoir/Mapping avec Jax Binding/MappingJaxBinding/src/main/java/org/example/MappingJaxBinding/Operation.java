package org.example.MappingJaxBinding;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;
@XmlRootElement
public class Operation {
    @XmlAttribute
    private TypeOperation type;
    @XmlAttribute
    private Date date ;
    @XmlAttribute
    private double montant ;
    @XmlAttribute
    private String description ;

    public Operation(TypeOperation type, Date date, double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", date=" + date +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }

    public Operation(){}
}
