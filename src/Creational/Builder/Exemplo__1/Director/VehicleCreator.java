package Creational.Builder.Exemplo__1.Director;

import Creational.Builder.Exemplo__1.Builder.IVehicleBuilder;
import Creational.Builder.Exemplo__1.Product.Vehicle;

public class VehicleCreator {
    private IVehicleBuilder objBuilder;

    public VehicleCreator(IVehicleBuilder builder) {
        this.objBuilder = builder;
    }

    public void createVehicle() {
        objBuilder.setModel();
        objBuilder.setEngine();
        objBuilder.setBody();
        objBuilder.setTransmission();
        objBuilder.setAccessories();
    }

    public Vehicle getVehicle() {
        return objBuilder.getVehicle();
    }
}