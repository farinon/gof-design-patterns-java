package designpatterns.facade;

import app.TesterInterface;
import app.AbstractTester;

public class FacadeTester  extends AbstractTester implements TesterInterface{
	private String title = "Facade";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este nome é uma analogia para uma fachada arquitetural. Um Facade é um objeto que \n"
					+ "provê uma interface simplificada para um corpo de código maior, como por exemplo, \n"
					+ "uma biblioteca de classes.\n"
					+ " O Padrão Facade é do tipo estrutural . É usado quando um sistema é muito complexo \n"
					+ "ou difícil de entender, já que possui um grande número de classes independentes ou \n"
					+ "se trechos de código fonte estão indisponíveis. Este padrão esconde as complexidades \n"
					+ "de um sistema maior e provê uma interface simplificada ao cliente. Tipicamente envol-\n"
					+ "ve uma única classe responsável por englobar uma série de membros requeridos pelo \n"
					+ "cliente. Estes membros acessam o sistema em nome do Facade e escondem os detalhes de\n"
					+ " implementação.\n";
		
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
        				+ "também se utiliza do pattern facade durante o carregamen-\n"
        				+ "to dos testers, por exemplo.");
	}

}
