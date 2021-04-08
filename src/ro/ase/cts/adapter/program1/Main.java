package ro.ase.cts.adapter.program1;


import ro.ase.cts.adapter.clase1.AdaptorCreditClase;
import ro.ase.cts.adapter.clase1.CreditAbstract;

public class Main {

    public static void afiseazaInformatiiCredit(CreditAbstract credit){
       credit.oferaCredit();
    }


    public static void main(String[] args){
        AdaptorCreditClase adaptorCreditClase = new AdaptorCreditClase(500,"Alin");
        adaptorCreditClase.oferaCredit();
    }
}


