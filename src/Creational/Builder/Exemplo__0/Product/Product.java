package Creational.Builder.Exemplo__0.Product;

import java.util.ArrayList;
import java.util.List;

// Classe Product representa o produto construído pelos builders.
public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void listParts() {
        System.out.print("Partes do produto: ");
        for (int i = 0; i < parts.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(parts.get(i));
        }
        System.out.println();
    }
}