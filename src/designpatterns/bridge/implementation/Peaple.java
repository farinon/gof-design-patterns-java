package designpatterns.bridge.implementation;

public class Peaple implements Transport {
    @Override
    public void transport() {
        System.out.println("Ve�culo Transportando Pessoas");
    }

    @Override
    public void transportDescription() {
        System.out.println("Ve�ulo que Transporta Pessoas");
    }
}
