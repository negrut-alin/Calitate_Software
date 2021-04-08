package ro.ase.cts.proxy.clase;

public class Proxy implements CreditAbstract{

    private CreditAbstract creditAbstract;

    @Override
    public void OferaCredit(Moneda moneda, float valoare) {
        if(moneda == Moneda.Lei){
            creditAbstract.OferaCredit(moneda,valoare);
        }
        else{
            System.out.println("Banca nu ofera credit pentru alte monede !");
        }
    }

    public Proxy(CreditAbstract creditAbstract){
        this.creditAbstract = creditAbstract;
    }

}
