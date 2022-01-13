package designpatterns.mediator.controlevoo;
public class Main {
	public static void main(String[] args) {
		
		atcInterface atcMediator = new Atc();
		
		Track track = new Track(atcMediator);
		
		Flight voo1 = new Flight(atcMediator);
		//Voo voo2 = new Voo(atcMediator);

		
		atcMediator.registerFlight(voo1);
		atcMediator.registerTrack(track);
		
		voo1.readyToLand();
		//pista.pouso();
		//voo1.pouso();
		
		//voo2.pouso();
		
		voo1.parked();
		
		//voo2.pouso();
		
	}
}
