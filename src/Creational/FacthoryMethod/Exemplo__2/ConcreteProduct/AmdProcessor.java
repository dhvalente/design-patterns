package Creational.FacthoryMethod.Exemplo__2.ConcreteProduct;

import Creational.FacthoryMethod.Exemplo__2.Product.Processor;

public class AmdProcessor implements Processor {
    private int registerMemorySize;

    public AmdProcessor(int size) {
        this.registerMemorySize = size;
    }

    @Override
    public int getRegisterMemorySize() {
        return registerMemorySize;
    }
}