package designpatterns.prototype;

public abstract class CarPrototype {
    protected double purchaseValue;
 
    public abstract String showInfo();
 
    public abstract CarPrototype clone();
 
    public double getPurchaseValue() {
        return purchaseValue;
    }
 
    public void setPurchasePrice(double valorCompra) {
        this.purchaseValue = valorCompra;
    }
}
