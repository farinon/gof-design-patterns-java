public class Pista implements Comando {
	private IAtc atcMediator;
	Pista(IAtc atcMediator){
		this.atcMediator = atcMediator;
	}
	
	@Override
	public void pouso() {
		System.out.println("A pista está disponível para pouso");
		atcMediator.setDisponibilidade(true);
		
	}

}
