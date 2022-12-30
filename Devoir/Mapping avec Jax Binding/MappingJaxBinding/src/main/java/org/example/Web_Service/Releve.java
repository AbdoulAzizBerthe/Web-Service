package org.example.Web_Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import static org.example.Web_Service.TypeOperation.CREDIT;
import static org.example.Web_Service.TypeOperation.DEBIT;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "ReleveService")
public class Releve {

    private int RIB;

    private Date dateReleve;

    private double solde;

    @WebMethod
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

    @WebMethod
    public void ajout(Operation operation){
         operations.ajoutOperation(operation);
    }
    @WebMethod
    public void ListOperation(){
       for(Operation operation : operations.operations){
           System.out.println(operation);
       }
    }

}
