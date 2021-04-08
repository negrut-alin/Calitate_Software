package ro.ase.cts.newproblem.clase;

public class Persoana {
    String CNP;
    String Nume;

    public Persoana(String CNP, String nume) {
        this.CNP = CNP;
        Nume = nume;
    }

    public int getVarsta() {
        return (CNP.charAt(0)=='1'|| CNP.charAt(0)=='2') ? (1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2))) :
                (CNP.charAt(0)=='3'|| CNP.charAt(0)=='4') ?
            (1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2))) :
        (CNP.charAt(0)=='5'|| CNP.charAt(0)=='6') ?
            (2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2))) : 0;

    }

    public String getCNP() {
        return CNP;
    }

    public String getNume() {
        return Nume;
    }
}
