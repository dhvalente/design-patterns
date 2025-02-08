package Creational.Builder.Exemplo__0.Builder;

import Creational.Builder.Exemplo__0.Product.Product;

// Interface Builder define métodos para criar partes dos objetos Produto.
public interface Builder {
    Product getProduct();
    void producePartA();
    void producePartB();
    void producePartC();
}