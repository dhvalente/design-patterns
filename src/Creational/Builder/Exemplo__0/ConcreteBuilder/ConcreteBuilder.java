package Creational.Builder.Exemplo__0.ConcreteBuilder;

import Creational.Builder.Exemplo__0.Builder.Builder;
import Creational.Builder.Exemplo__0.Product.Product;

// ConcreteBuilder1 implementa a interface Builder para construir um tipo específico de Produto.
public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        reset();
    }

    public void reset() {
        product = new Product();
    }

    public Product getProduct() {
        Product result = product;
        reset();
        return result;
    }

    public void producePartA() {
        product.add("PartA1");
    }

    public void producePartB() {
        product.add("PartB1");
    }

    public void producePartC() {
        product.add("PartC1");
    }
}