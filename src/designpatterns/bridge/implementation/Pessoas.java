package designpatterns.bridge.implementation;

public class Pessoas implements Transporte {
    @Override
    public void transportar() {
        System.out.println("Ve�culo Transportando Pessoas");
    }

    @Override
    public void descricaoTransporte() {
        System.out.println("Ve�ulo que Transporta Pessoas");
    }
}
