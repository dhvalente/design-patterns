package Creational.Builder.Exemplo__1;

import Creational.Builder.Exemplo__1.ConcreteBuilder.FerrariBuilder;
import Creational.Builder.Exemplo__1.ConcreteBuilder.HondaBuilder;
import Creational.Builder.Exemplo__1.Director.VehicleCreator;
import Creational.Builder.Exemplo__1.Product.Vehicle;

public class Program {

    public static void main(String[] args) {
        VehicleCreator vehicleCreator = new VehicleCreator(new FerrariBuilder());
        vehicleCreator.createVehicle();
        Vehicle vehicle = vehicleCreator.getVehicle();
        vehicle.showInfo();

        System.out.println("---------------------------------------------");

        vehicleCreator = new VehicleCreator(new HondaBuilder());
        vehicleCreator.createVehicle();
        vehicle = vehicleCreator.getVehicle();
        vehicle.showInfo();
    }
}