package ro.ase.cts.newproblem.clase;

public class Facade {
    public static boolean esteEligibil(Persoana persoana){
        return persoana.getVarsta() >= 18
                && (!Politie.esteUrmarit(persoana)
                && (!BirouCredit.areDatorii(persoana)));
     }
}
