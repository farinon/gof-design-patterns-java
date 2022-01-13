package designpatterns.prototype;

public class FiestaPrototype extends CarPrototype {
	 
    protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
        this.purchaseValue = fiestaPrototype.getPurchaseValue();
    }
 
    public FiestaPrototype() {
        purchaseValue = 0.0;
    }
 
    @Override
    public String showInfo() {
        return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$"
                + getPurchaseValue();
    }
 
    @Override
    public CarPrototype clone() {
        return new FiestaPrototype(this);
    }
 
}