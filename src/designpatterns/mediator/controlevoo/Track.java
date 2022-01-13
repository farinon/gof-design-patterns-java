package designpatterns.mediator.controlevoo;
public class Track implements Command {
	private atcInterface atcMediator;
	Track(atcInterface atcMediator){
		this.atcMediator = atcMediator;
	}
	
	@Override
	public void landing() {
		System.out.println("A pista est� dispon�vel para pouso");
		atcMediator.setAvailability(true);
		
	}

}
