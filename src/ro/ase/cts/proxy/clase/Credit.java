package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract{
    @Override
    public void OferaCredit(Moneda moneda, float valoare) {
        System.out.println("S-a achizitionat un credit de " + valoare + " " + moneda.toString());
    }
}
