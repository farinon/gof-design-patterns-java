package designpatterns.bridge.implementation;

public class Loads implements Transport {
    @Override
    public void transport() {
        System.out.println("Veículo Transportando Cargas");
    }

    @Override
    public void transportDescription() {
        System.out.println("Veículo que Transporta Cargas");
    }
}