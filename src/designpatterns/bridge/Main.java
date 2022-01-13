package designpatterns.bridge;

import designpatterns.bridge.abstraction.Caminhao;
import designpatterns.bridge.abstraction.Onibus;
import designpatterns.bridge.abstraction.Veiculo;
import designpatterns.bridge.implementation.Cargas;
import designpatterns.bridge.implementation.Pessoas;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---------------------------------------- ");

        Veiculo caminhao = new Caminhao("Scania", new Cargas());
        caminhao.realizarAtividade();

        System.out.println(" ---------------------------------------- ");

        Veiculo onibus = new Onibus("Mercedes", new Pessoas());
        onibus.realizarAtividade();

        System.out.println(" ---------------------------------------- ");
    }
}
