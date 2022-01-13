
package designpatterns.composite;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Box masterBox = new Box(new ArrayList<Item>()); 
		
		masterBox.addItem(new Product("Clean Code: A Handbook of Agile Software Craftsmanship", 202.71));
		
		Box smartphonesBox = new Box(new ArrayList<Item>());
		smartphonesBox.addItem(new Product("Samsung Galaxy S21 Ultra 5G", 6191.10));
		smartphonesBox.addItem(new Product("Samsung Galaxy S20 FE", 2189));
		smartphonesBox.addItem(new Product("iPhone 13", 7599));
		smartphonesBox.addItem(new Product("iPhone 13 mini", 6599));
		masterBox.addItem(smartphonesBox);
		
		Box notebooksBox = new Box(new ArrayList<Item>());
		notebooksBox.addItem(new Product("Acer Nitro AN515-44-R5YZ", 5499));
		notebooksBox.addItem(new Product("Dell G15", 5301));
		masterBox.addItem(notebooksBox);
		
		Box tootlBox = new Box(new ArrayList<Item>());
		tootlBox.addItem(new Product("Martelo de Unha 25mm", 37.30));
		tootlBox.addItem(new Product("Trena 5m", 17.10));
		tootlBox.addItem(new Product("Alicate 7", 25));
		tootlBox.addItem(new Product("Chave de Fenda Ponta Cruzada 1/8x6 Polegadas", 5.90));
		masterBox.addItem(tootlBox);
		
		System.out.println("VALOR TOTAL = " + masterBox.calculateFinalPrice());
	}
}

