package Creational.Builder.Exemplo__0;


import Creational.Builder.Exemplo__0.Builder.Builder;
import Creational.Builder.Exemplo__0.ConcreteBuilder.ConcreteBuilder;
import Creational.Builder.Exemplo__0.Director.Director;

public class Program {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.setBuilder(builder);

        System.out.println("Produto básico padrão:");
        director.buildMinimalViableProduct();
        builder.getProduct().listParts();

        System.out.println();

        System.out.println("Produto completo padrão:");
        director.buildFullFeaturedProduct();
        builder.getProduct().listParts();

        System.out.println();

        System.out.println("Produto personalizado:");
        builder.producePartA();
        builder.producePartB();
        builder.getProduct().listParts();
    }
}