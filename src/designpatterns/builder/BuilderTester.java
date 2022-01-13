package designpatterns.builder;

import app.TesterInterface;
import designpatterns.builder.builders.CarBuilder;
import designpatterns.builder.builders.CarManualBuilder;
import designpatterns.builder.cars.Car;
import designpatterns.builder.cars.Manual;
import designpatterns.builder.director.Director;
import app.AbstractTester;

public class BuilderTester  extends AbstractTester implements TesterInterface{
	private String title = "Builder";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este padrão é um padrão de projeto de software criacional que permite a separação \n"
				+ "da construção de um objeto complexo da sua representação, de forma que o mesmo pro- \n"
				+ "cesso de construção possa criar diferentes representações.\n"
				+ "  Exemplo de utilização do padrão Builder seria em uma aplicação que converte o for-\n"
				+ "mato de texto RTF para uma série de outros formatos e que permite a inclusão de su-\n"
				+ "porte para conversão para outros formatos, sem a alteração do código fonte do leitor \n"
				+ "de RTF.\n";
		
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
		Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
		showMenu(title);
	}

}
