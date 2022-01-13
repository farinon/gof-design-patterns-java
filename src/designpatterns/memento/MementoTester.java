package designpatterns.memento;

import app.TesterInterface;
import app.AbstractTester;

public class MementoTester  extends AbstractTester implements TesterInterface{
	private String title = "Memento";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Padrão comportamental que permite armazenar o estado interno de um objeto em um \n"
					+ "determinando momento, para que seja possível retorná-lo a este estado, sem que \n"
					+ "isso cause problemas com o encapsulamento.\n"
					+ " Ele funciona de maneira que uma classe é responsável por salvar o estado do objeto\n"
					+ " desejado enquanto que uma outra classe fica responsável por armazenar todas essas \n"
					+ "copias (mementos).\n"
					+ " O padrão Memento é implementado se utilizando de três elementos: Originador, Arma-\n"
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
		Originator originator = new Originator();
	    History storer = new History();
	    
	    
	    originator.setState("State #1");
	    
	    
	    originator.setState("State #2");
	    storer.saveState(originator.generateMemento());
	    
	    
	    originator.setState("State #3");
	    storer.saveState(originator.generateMemento());
	    
	    
	    originator.setState("State #4");
	    System.out.println("Current State: " + originator.getState());		
	    
	    originator.setStateFromMemento(storer.getState(0));
	    System.out.println("First saved State ----- " + originator.getState());
	    
	    originator.setStateFromMemento(storer.getState(1));
	    System.out.println("Second saved State ----- " + originator.getState());
	}

}
