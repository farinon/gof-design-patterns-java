package designpatterns.visitor;

public class ConcreteVisitor implements Visitor {
	
	public void visit (ConcreteElement concreteElement) {
		
		System.out.println ("Estou visitando: " +
			concreteElement.getClass().getName());
	}

}