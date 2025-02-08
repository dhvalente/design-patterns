package Creational.Builder.Exemplo__1.ConcreteBuilder;

import Creational.Builder.Exemplo__1.Builder.IVehicleBuilder;
import Creational.Builder.Exemplo__1.Product.Vehicle;

public class HondaBuilder implements IVehicleBuilder {
    private Vehicle objVehicle = new Vehicle();

    @Override
    public void setModel() {
        objVehicle.setModel("Honda");
    }

    @Override
    public void setEngine() {
        objVehicle.setEngine("4 Stroke");
    }

    @Override
    public void setTransmission() {
        objVehicle.setTransmission("125 Km/hr");
    }

    @Override
    public void setBody() {
        objVehicle.setBody("Plastic");
    }

    @Override
    public void setAccessories() {
        objVehicle.getAccessories().add("Seat Cover");
        objVehicle.getAccessories().add("Rear Mirror");
        objVehicle.getAccessories().add("Helmet");
    }

    @Override
    public Vehicle getVehicle() {
        return objVehicle;
    }
}
