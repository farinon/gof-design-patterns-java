package designpatterns.bridge.abstraction;

import designpatterns.bridge.implementation.Transport;

public abstract class Vehicle {
    protected Transport transport;
    protected String brand;

    protected Vehicle(String brand, Transport transport){
        this.transport = transport;
        this.brand = brand;
    }

    abstract public void performActivity();
}
