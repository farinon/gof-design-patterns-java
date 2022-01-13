package designpatterns.memento;

import app.TesterInterface;
import app.AbstractTester;

public class MementoTester  extends AbstractTester implements TesterInterface{
	private String title = "Memento";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Padr�o comportamental que permite armazenar o estado interno de um objeto em um \n"
					+ "determinando momento, para que seja poss�vel retorn�-lo a este estado, sem que \n"
					+ "isso cause problemas com o encapsulamento.\n"
					+ " Ele funciona de maneira que uma classe � respons�vel por salvar o estado do objeto\n"
					+ " desejado enquanto que uma outra classe fica respons�vel por armazenar todas essas \n"
					+ "copias (mementos).\n"
					+ " O padr�o Memento � implementado se utilizando de tr�s elementos: Originador, Arma-\n"
					+ "zenador e o Memento.\n";
		
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
		Originator originador = new Originator();
	    History armazenador = new History();
	    
	    
	    originador.setState("State #1");
	    
	    
	    originador.setState("State #2");
	    armazenador.saveState(originador.generateMemento());
	    
	    
	    originador.setState("State #3");
	    armazenador.saveState(originador.generateMemento());
	    
	    
	    originador.setState("State #4");
	    System.out.println("Current State: " + originador.getState());		
	    
	    originador.setStateFromMemento(armazenador.getState(0));
	    System.out.println("First saved State ----- " + originador.getState());
	    
	    originador.setStateFromMemento(armazenador.getState(1));
	    System.out.println("Second saved State ----- " + originador.getState());
	}

}
