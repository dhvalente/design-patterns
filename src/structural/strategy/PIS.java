package structural.strategy;

public class PIS implements Impostos {
    private double valor;

    public PIS() {
        this.valor = 11;
        Impostos.addImposto(this);
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "PIS";
    }
}