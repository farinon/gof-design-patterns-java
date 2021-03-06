package designpatterns.abstractfactory;

import app.TesterInterface;
import app.AbstractTester;

public class AbstractFactoryTester  extends AbstractTester implements TesterInterface{
	private String title = "Abstract Factory";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este padr?o permite a cria??o de fam?lias de objetos relacionados ou dependentes \n"
					+ "por meio de uma ?nica interface e sem que a classe concreta seja especificada. Uma \n"
					+ "f?brica ? a localiza??o de uma classe concreta no c?digo em que objetos s?o cons-  \n"
					+ "tru?dos .\n"
					+ "O objetivo em empregar o padr?o ? isolar a cria??o de objetos de seu uso e criar   \n"
					+ "fam?lias de objetos relacionados sem ter que depender de suas classes concretas.   \n";
		
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
		
		Vehicle carro1 = offRoadFactory.getVehicle("X");
		carro1.method();
		
		Vehicle carro2 = offRoadFactory.getVehicle("Y");
		carro2.method();
		
		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");
		
		Vehicle carro3 = streetFactory.getVehicle("X");
		carro3.method();
		
		Vehicle carro4 = streetFactory.getVehicle("Y");
		carro4.method();
		showMenu(title);
	}

}
