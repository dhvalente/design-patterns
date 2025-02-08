package structural.strategy;

import java.util.ArrayList;
import java.util.List;

public interface Impostos {
    List<Impostos> impostos = new ArrayList<>();

    double getValor();

    static void addImposto(Impostos imposto) {
        impostos.add(imposto);
    }
}