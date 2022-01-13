package designpatterns.bridge.abstraction;

import designpatterns.bridge.implementation.Transport;

public class Truck extends Vehicle {

    public Truck(String brand, Transport transport) {
        super(brand, transport);
    }

    @Override
    public void performActivity() {
        System.out.print(" Caminhão " + brand + ": ");
        this.transport.transport();
    }
}
