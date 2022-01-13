package designpatterns.bridge.implementation;

public class Peaple implements Transport {
    @Override
    public void transport() {
        System.out.println("Veículo Transportando Pessoas");
    }

    @Override
    public void transportDescription() {
        System.out.println("Veíulo que Transporta Pessoas");
    }
}
