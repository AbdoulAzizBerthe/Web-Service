package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class TestSerialisationXML
{
    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext=JAXBContext.newInstance(Banque.class);
        Banque banque = new Banque();
        banque.comptes.add(new Compte(1,4000,new Date(),TypeCompte.COURANT));
        banque.comptes.add(new Compte(2,4050,new Date(),TypeCompte.EPARGNE));
        banque.comptes.add(new Compte(3,43000,new Date(),TypeCompte.COURANT));
        banque.comptes.add(new Compte(4,6000,new Date(),TypeCompte.EPARGNE));
        Compte c1 = new Compte(1,4000,new Date(),TypeCompte.COURANT);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(banque,new File("banque.xml"));
        //marshaller.marshal(banque,System.out);
    }

}
