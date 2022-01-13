package designpatterns.bridge;

import designpatterns.bridge.abstraction.Truck;
import designpatterns.bridge.abstraction.Bus;
import designpatterns.bridge.abstraction.Vehicle;
import designpatterns.bridge.implementation.Loads;
import designpatterns.bridge.implementation.Peaple;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------------------------------------- ");

        Vehicle caminhao = new Truck("Scania", new Loads());
        caminhao.performActivity();

        System.out.println(" ---------------------------------------- ");

        Vehicle onibus = new Bus("Mercedes", new Peaple());
        onibus.performActivity();

        System.out.println(" ---------------------------------------- ");
    }
}
