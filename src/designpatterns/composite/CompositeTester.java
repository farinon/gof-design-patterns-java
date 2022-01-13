package designpatterns.composite;

import app.TesterInterface;

import java.util.ArrayList;

import app.AbstractTester;

public class CompositeTester  extends AbstractTester implements TesterInterface{
	private String title = "Composite";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Este padr�o de projeto de software � utilizado para representar um objeto formado \n"
					+ "pela composi��o de objetos similares. Este conjunto de objetos pressup�e uma mesma \n"
					+ "hierarquia de classes a que ele pertence. Tal padr�o �, normalmente, utilizado para \n"
					+ "representar listas recorrentes - ou recursivas - de elementos. Al�m disso, este modo \n"
					+ "de representa��o hier�rquica de classes permite que os elementos contidos em um \n"
					+ "objeto composto sejam tratados como se fossem um objeto �nico. Desta forma, os m�to-\n"
					+ "dos comuns �s classes podem ser aplicados, tamb�m, ao conjunto agrupado no objeto com-\n"
					+ "posto.\n";
		
		System.out.println(content);
		System.out.println("");
		showMenu(title);
	}

	public String getTitle() {
		return title;
	}
	protected void choseOption() {
		var n = reader.nextInt();
		switch(n){
			case 1:
				showAbstract();
	            break;
	
	        case 2:
	            start();
	            break;
	            
	        case 3:
	            app.Main.showMenu();
	            break;
	            
	
	        default:
	        	showMenu(title);
		}
	   }
	@Override
	public void start() {
		showTitle(title);
Box caixaMaster = new Box(new ArrayList<Item>()); 
		
		caixaMaster.addItem(new Produto("Clean Code: A Handbook of Agile Software Craftsmanship", 202.71));
		
		Box caixaSmartphones = new Box(new ArrayList<Item>());
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S21 Ultra 5G", 6191.10));
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S20 FE", 2189));
		caixaSmartphones.addItem(new Produto("iPhone 13", 7599));
		caixaSmartphones.addItem(new Produto("iPhone 13 mini", 6599));
		caixaMaster.addItem(caixaSmartphones);
		
		Box caixaNotebooks = new Box(new ArrayList<Item>());
		caixaNotebooks.addItem(new Produto("Acer Nitro AN515-44-R5YZ", 5499));
		caixaNotebooks.addItem(new Produto("Dell G15", 5301));
		caixaMaster.addItem(caixaNotebooks);
		
		Box caixaFerramentas = new Box(new ArrayList<Item>());
		caixaFerramentas.addItem(new Produto("Martelo de Unha 25mm", 37.30));
		caixaFerramentas.addItem(new Produto("Trena 5m", 17.10));
		caixaFerramentas.addItem(new Produto("Alicate 7", 25));
		caixaFerramentas.addItem(new Produto("Chave de Fenda Ponta Cruzada 1/8x6 Polegadas", 5.90));
		caixaMaster.addItem(caixaFerramentas);
		
		System.out.println("VALOR TOTAL = " + caixaMaster.calculateFinalPrice());
	}

}
