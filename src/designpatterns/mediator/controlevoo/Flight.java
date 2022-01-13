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
			atcMediator.setAvailability(false); //a pista está ocupada
		}
		else {	
			System.out.println("Aguarde pista disponível");
		}	
		
	}
	public void  readyToLand() {
		System.out.println("Pouso iniciado");
		
	}
	public void parked() {
		System.out.println("Voo estacionado.");
		atcMediator.setAvailability(true);//a pista está disponível
	}
}
