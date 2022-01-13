package designpatterns.memento;

public class Main {
	public static void main(String[] args) {
		
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