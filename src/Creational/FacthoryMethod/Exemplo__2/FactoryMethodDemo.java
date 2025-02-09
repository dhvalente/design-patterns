package Creational.FacthoryMethod.Exemplo__2;

import Creational.FacthoryMethod.Exemplo__2.ConcreteProduct.AmdProcessor;
import Creational.FacthoryMethod.Exemplo__2.ConcreteProduct.IntelProcessor;
import Creational.FacthoryMethod.Exemplo__2.Product.Processor;

import java.util.Random;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        Random random = new Random();
        String processorType = random.nextBoolean() ? "intel" : "amd";

        Processor processor = null;
        if (processorType.equals("intel")) {
            processor = new IntelProcessor(1024);
        }
        if (processorType.equals("amd")) {
            processor = new AmdProcessor(512);
        }

        int size = processor.getRegisterMemorySize();
        System.out.println(size);
    }
}