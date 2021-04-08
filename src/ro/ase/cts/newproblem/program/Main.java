package ro.ase.cts.newproblem.program;

import ro.ase.cts.newproblem.clase.Facade;
import ro.ase.cts.newproblem.clase.Persoana;

public class Main {
    public static void Main(String[] Args){
        Persoana persoana = new Persoana("590021122","Alin");

        if (Facade.esteEligibil(persoana)) {
            System.out.println("Este Eligil pentru credit !");
        } else {
            System.out.println("Este Eligibil pentru credit !");
        }
    }
}
