package designpatterns.abstractfactory;

import app.TesterInterface;
import app.AbstractTester;

public class AbstractFactoryTester  extends AbstractTester implements TesterInterface{
	private String title = "Abstract Factory";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este padrão permite a criação de famílias de objetos relacionados ou dependentes \n"
					+ "por meio de uma única interface e sem que a classe concreta seja especificada. Uma \n"
					+ "fábrica é a localização de uma classe concreta no código em que objetos são cons-  \n"
					+ "truídos .\n"
					+ "O objetivo em empregar o padrão é isolar a criação de objetos de seu uso e criar   \n"
					+ "famílias de objetos relacionados sem ter que depender de suas classes concretas.   \n";
		
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
		AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");
		
		Veiculo carro1 = offRoadFactory.getVeiculo("X");
		carro1.method();
		
		Veiculo carro2 = offRoadFactory.getVeiculo("Y");
		carro2.method();
		
		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");
		
		Veiculo carro3 = streetFactory.getVeiculo("X");
		carro3.method();
		
		Veiculo carro4 = streetFactory.getVeiculo("Y");
		carro4.method();
	}

}
