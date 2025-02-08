package structural.strategy;

import java.util.List;

public class Main {
    private final List<Impostos> impostos = Impostos.impostos;

    public static void main(String[] args) {
        new ICM();
        new PIS();
        new ISS();

        Main main = new Main();
        main.imprimeImpostos();
    }

    public void imprimeImpostos() {
        for (Impostos imposto : impostos) {
            System.out.println(imposto);
        }
    }
}