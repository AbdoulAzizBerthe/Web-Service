package org.example.MappingJaxBinding;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
public class Releve {
    @XmlAttribute
    private int RIB;
    @XmlElement
    private Date dateReleve;
    @XmlElement
    private double solde;

    @Override
    public String toString() {
        return "Releve{" +
                "RIB=" + RIB +
                ", dateReleve=" + dateReleve +
                ", solde=" + solde +
                ", operations=" + operations +
                '}';
    }

    public Operations operations = new Operations(new Date(2021-01-01),new Date(2021-01-30));
     //List<Operation> operations = new ArrayList<>();

     public Releve(){}
    public Releve(int RIB, Date dateReleve, double solde) {
        this.RIB = RIB;
        this.dateReleve = dateReleve;
        this.solde = solde;
    }
}
