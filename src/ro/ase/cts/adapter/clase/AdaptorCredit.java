package ro.ase.cts.adapter.clase;


public class AdaptorCredit implements CreditAbstract {

    private Leasing leasing;

    @Override
    public void oferaCredit(float suma) {
     leasing.imprumuta();
    }
    public AdaptorCredit(Leasing leasing) {
        this.leasing = leasing;
    }
}
