package designpatterns.bridge.abstraction;

import designpatterns.bridge.implementation.Transporte;

public class Caminhao extends Veiculo {

    public Caminhao(String marca, Transporte transporte) {
        super(marca, transporte);
    }

    @Override
    public void realizarAtividade() {
        System.out.print(" Caminh�o " + marca + ": ");
        this.transporte.transportar();
    }
}
