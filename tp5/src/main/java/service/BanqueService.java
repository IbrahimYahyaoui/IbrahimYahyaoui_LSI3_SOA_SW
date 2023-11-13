package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.Date;
import java.util.List;

@WebService(name = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "convertEuroToDinar")
    public double conversion(@WebParam(name = "montant") int montant){
        return  montant*3.36;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, 0, new Date());
    }

    @WebMethod
    public List<Compte> getComptes(){
        return List.of(
                new Compte(1,0, new Date()),
                new Compte(2,0, new Date()),
                new Compte(3,0, new Date())
        );
    }
}
