package designpatterns.prototype;

public class Main {

	public static void main(String[] args) {
	    PalioPrototype palioPrototype = new PalioPrototype();
	 
	    CarPrototype newPalio = palioPrototype.clone();
	    newPalio.setPurchasePrice(27900.0);
	    CarPrototype palioUsado = palioPrototype.clone();
	    palioUsado.setPurchasePrice(21000.0);
	 
	    System.out.println(newPalio.showInfo());
	    System.out.println(palioUsado.showInfo());
	}

}
