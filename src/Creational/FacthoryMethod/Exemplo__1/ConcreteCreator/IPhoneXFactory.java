package Creational.FacthoryMethod.Exemplo__1.ConcreteCreator;

import Creational.FacthoryMethod.Exemplo__1.ConcreteProduct.IPhoneX;
import Creational.FacthoryMethod.Exemplo__1.Creator.IPhoneFactory;
import Creational.FacthoryMethod.Exemplo__1.Product.IPhone;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneX();
    }
}
