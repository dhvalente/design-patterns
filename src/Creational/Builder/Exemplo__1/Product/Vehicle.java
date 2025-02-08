package Creational.Builder.Exemplo__1.Product;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String model;
    private String engine;
    private String transmission;
    private String body;
    private List<String> accessories;

    public Vehicle() {
        this.accessories = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getAccessories() {
        return accessories;
    }

    public void addAccessory(String accessory) {
        this.accessories.add(accessory);
    }

    public void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine);
        System.out.println("Body: " + body);
        System.out.println("Transmission: " + transmission);
        System.out.println("Accessories:");
        for (String accessory : accessories) {
            System.out.println("\t" + accessory);
        }
    }
}
