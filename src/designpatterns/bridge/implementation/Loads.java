package designpatterns.bridge.implementation;

public class Loads implements Transport {
    @Override
    public void transport() {
        System.out.println("Ve�culo Transportando Cargas");
    }

    @Override
    public void transportDescription() {
        System.out.println("Ve�culo que Transporta Cargas");
    }
}