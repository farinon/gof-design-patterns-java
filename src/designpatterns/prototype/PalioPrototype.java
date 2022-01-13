package designpatterns.prototype;

public class PalioPrototype extends CarPrototype {
	 
    protected PalioPrototype(PalioPrototype palioPrototype) {
        this.purchaseValue = palioPrototype.getPurchaseValue();
    }
 
    public PalioPrototype() {
        purchaseValue = 0.0;
    }
 
    @Override
    public String showInfo() {
        return "Modelo: Palio\nMontadora: Fiat\n" + "Valor: R$"
                + getPurchaseValue();
    }
 
    @Override
    public CarPrototype clone() {
        return new PalioPrototype(this);
    }
 
}