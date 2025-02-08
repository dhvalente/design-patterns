package structural.strategy;

public class ICM implements Impostos {
    private double valor;

    public ICM() {
        this.valor = 5;
        Impostos.addImposto(this);
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ICM";
    }
}