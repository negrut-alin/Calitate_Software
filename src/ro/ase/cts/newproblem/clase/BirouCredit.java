package ro.ase.cts.newproblem.clase;

public class BirouCredit {
    public static boolean areDatorii(Persoana persoana){
       return !(Integer.parseInt("" + persoana.CNP.charAt(12)) % 2 == 0);
    }
}
