package designpatterns.mediator.controlevoo;
public class Flight implements Command {
	private atcInterface atcMediator;
	Flight (atcInterface atcMediator){
		this.atcMediator = atcMediator;
	}
	
	@Override
	public void landing() {
		if(atcMediator.isAvaible()) {
			System.out.println("Pouso realizado com sucesso!");
			atcMediator.setAvailability(false); //a pista est� ocupada
		}
		else {	
			System.out.println("Aguarde pista dispon�vel");
		}	
		
	}
	public void  readyToLand() {
		System.out.println("Pouso iniciado");
		
	}
	public void parked() {
		System.out.println("Voo estacionado.");
		atcMediator.setAvailability(true);//a pista est� dispon�vel
	}
}
