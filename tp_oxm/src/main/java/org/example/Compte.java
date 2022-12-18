package org.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte
{
    private int code;
    private double solde;
    private Date dateCreation;
    @XmlAttribute
    private TypeCompte type;

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", datecreation=" + dateCreation +
                ", type=" + type +
                '}';
    }


    public Compte() {
    }

    public Compte(int code, double solde, Date datecreation, TypeCompte type) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = datecreation;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDatecreation() {
        return dateCreation;
    }

    public void setDatecreation(Date datecreation) {
        this.dateCreation = datecreation;
    }

    public TypeCompte getType() {
        return type;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }
}
