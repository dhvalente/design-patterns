package Creational.FacthoryMethod.Exemplo__1;

import Creational.FacthoryMethod.Exemplo__1.ConcreteCreator.IPhone11ProFactory;
import Creational.FacthoryMethod.Exemplo__1.ConcreteCreator.IPhoneXFactory;
import Creational.FacthoryMethod.Exemplo__1.Creator.IPhoneFactory;
import Creational.FacthoryMethod.Exemplo__1.Product.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = iphoneXFactory.orderIPhone();
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = iphone11ProFactory.orderIPhone();
        System.out.println(iphone2);
    }
}