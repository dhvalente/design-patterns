package Creational.FacthoryMethod.Exemplo__1.ConcreteCreator;

import Creational.FacthoryMethod.Exemplo__1.ConcreteProduct.IPhoneXSMax;
import Creational.FacthoryMethod.Exemplo__1.Creator.IPhoneFactory;
import Creational.FacthoryMethod.Exemplo__1.Product.IPhone;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
