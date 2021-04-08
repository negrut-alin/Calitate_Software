package ro.ase.cts.adapter.clase1;

public class Leasing {
    private float suma;
    private String numeClient;

    public float getSuma() {
        return suma;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public Leasing(float suma, String numeClient) {
        this.suma = suma;
        this.numeClient = numeClient;
    }

    public void imprumuta(){
        System.out.println(numeClient + " a realizat leasing in suma de " + suma);
    }
}
