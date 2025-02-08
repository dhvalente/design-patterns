package structural.strategy;

public class ISS implements Impostos {
    private double valor;

    public ISS() {
        this.valor = 3;
        Impostos.addImposto(this);
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ISS";
    }
}