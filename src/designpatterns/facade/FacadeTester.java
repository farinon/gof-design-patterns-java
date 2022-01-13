package designpatterns.facade;

import app.TesterInterface;
import app.AbstractTester;

public class FacadeTester  extends AbstractTester implements TesterInterface{
	private String title = "Facade";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este nome � uma analogia para uma fachada arquitetural. Um Facade � um objeto que \n"
					+ "prov� uma interface simplificada para um corpo de c�digo maior, como por exemplo, \n"
					+ "uma biblioteca de classes.\n"
					+ " O Padr�o Facade � do tipo estrutural . � usado quando um sistema � muito complexo \n"
					+ "ou dif�cil de entender, j� que possui um grande n�mero de classes independentes ou \n"
					+ "se trechos de c�digo fonte est�o indispon�veis. Este padr�o esconde as complexidades \n"
					+ "de um sistema maior e prov� uma interface simplificada ao cliente. Tipicamente envol-\n"
					+ "ve uma �nica classe respons�vel por englobar uma s�rie de membros requeridos pelo \n"
					+ "cliente. Estes membros acessam o sistema em nome do Facade e escondem os detalhes de\n"
					+ " implementa��o.\n";
		
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
		ComputerFacade facade = new ComputerFacade();
        facade.run();
        System.out.println("\n\nOBS: O funcionamento do menu inicial deste sistema \n"
        				+ "tamb�m se utiliza do pattern facade durante o carregamen-\n"
        				+ "to dos testers, por exemplo.");
	}

}
