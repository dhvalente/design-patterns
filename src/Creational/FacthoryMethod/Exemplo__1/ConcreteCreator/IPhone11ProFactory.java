package Creational.FacthoryMethod.Exemplo__1.ConcreteCreator;

import Creational.FacthoryMethod.Exemplo__1.ConcreteProduct.IPhone11Pro;
import Creational.FacthoryMethod.Exemplo__1.Creator.IPhoneFactory;
import Creational.FacthoryMethod.Exemplo__1.Product.IPhone;

public class IPhone11ProFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
