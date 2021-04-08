package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdaptorCredit;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

    public static void AfiseazaCredit(CreditAbstract creditAbstract,float suma){
        creditAbstract.oferaCredit(1000);
    }

    public static void main(String[] args){
        Leasing leasing = new Leasing(1000,"Alin");
        AdaptorCredit adaptorCredit = new AdaptorCredit(leasing);
        AfiseazaCredit(adaptorCredit,leasing.getSuma());
    }
}
