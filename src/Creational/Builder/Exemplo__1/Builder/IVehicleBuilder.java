package Creational.Builder.Exemplo__1.Builder;

import Creational.Builder.Exemplo__1.Product.Vehicle;

public interface IVehicleBuilder {
    void setModel();
    void setEngine();
    void setTransmission();
    void setBody();
    void setAccessories();
    Vehicle getVehicle();
}
