package designpatterns.prototype;

public class PalioPrototype extends CarroPrototype {
	 
    protected PalioPrototype(PalioPrototype palioPrototype) {
        this.valorCompra = palioPrototype.getValorCompra();
    }
 
    public PalioPrototype() {
        valorCompra = 0.0;
    }
 
    @Override
    public String exibirInfo() {
        return "Modelo: Palio\nMontadora: Fiat\n" + "Valor: R$"
                + getValorCompra();
    }
 
    @Override
    public CarroPrototype clonar() {
        return new PalioPrototype(this);
    }
 
}