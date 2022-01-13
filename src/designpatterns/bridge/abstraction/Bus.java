package designpatterns.bridge.abstraction;

import designpatterns.bridge.implementation.Transport;

public class Bus extends Vehicle {

    public Bus(String brand, Transport transport) {
        super(brand, transport);
    }

    @Override
    public void performActivity() {
        System.out.print(" Ônibus " + brand + ": ");
        this.transport.transport();
    }
}