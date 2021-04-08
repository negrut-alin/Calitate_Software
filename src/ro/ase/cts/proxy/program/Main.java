package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.Credit;
import ro.ase.cts.proxy.clase.Moneda;
import ro.ase.cts.proxy.clase.Proxy;

public class Main {
    public static void main(String[] Args){
        Credit credit = new Credit();
        credit.OferaCredit(Moneda.Lei,10000);

        Proxy proxy = new Proxy(credit);
        proxy.OferaCredit(Moneda.Euro,10000);
        proxy.OferaCredit(Moneda.Lei,10000);
    }
}
