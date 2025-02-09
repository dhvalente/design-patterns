package Creational.FacthoryMethod.Exemplo__1.Creator;

import Creational.FacthoryMethod.Exemplo__1.Product.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone() {
        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}
