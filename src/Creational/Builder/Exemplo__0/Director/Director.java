package Creational.Builder.Exemplo__0.Director;


import Creational.Builder.Exemplo__0.Builder.Builder;

// Diretor (Director) é responsável por coordenar a sequência de construção do produto.
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildMinimalViableProduct() {
        builder.producePartA();
    }

    public void buildFullFeaturedProduct() {
        builder.producePartA();
        builder.producePartB();
        builder.producePartC();
    }
}