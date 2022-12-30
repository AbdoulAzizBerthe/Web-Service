package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

import static org.example.TypeOperation.CREDIT;
import static org.example.TypeOperation.DEBIT;

public class Serialiser {
    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Releve releve = new Releve(122333323,new Date(2021,01,01), 14500);
        releve.operations.ajoutOperation(new Operation(CREDIT,new Date(2021-01-01),9000,"Vers Espece"));
        releve.operations.ajoutOperation(new Operation(DEBIT,new Date(2021-01-11),3400,"Cheque Guichet"));
        releve.operations.ajoutOperation(new Operation(CREDIT,new Date(2021-01-15),120,"Prelevement Assurence"));
        releve.operations.ajoutOperation(new Operation(DEBIT,new Date(2021-01-25),70000,"Virement..."));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("Releve.xml"));
    }
}
