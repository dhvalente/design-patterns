package Creational.FacthoryMethod.Exemplo__1.ConcreteProduct;

import Creational.FacthoryMethod.Exemplo__1.Product.IPhone;

public class IPhone11 extends IPhone {

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}