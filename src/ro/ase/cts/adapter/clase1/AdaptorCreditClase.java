package ro.ase.cts.adapter.clase1;

public class AdaptorCreditClase extends Leasing implements CreditAbstract{
    @Override
    public void oferaCredit() {
        super.imprumuta();
    }

    public AdaptorCreditClase(float suma, String numeClient) {
        super(suma, numeClient);
    }
}
