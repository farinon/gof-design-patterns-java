package designpatterns.chainofresponsibility;

import app.TesterInterface;
import app.AbstractTester;

public class ChainOfResponsibilityTester  extends AbstractTester implements TesterInterface{
	private String title = "Chain Of Responsibility";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Em Orientação a Objetos, Chain of Responsibility é um padrão GOF cuja principal função \n"
					+ "é evitar a dependência entre um objeto receptor e um objeto solicitante. Consiste em uma \n"
					+ "série de objetos receptores e de objetos de solicitação, onde cada objetos de solicitação \n"
					+ "possui uma lógica interna que separa quais são tipos de objetos receptores que podem ser \n"
					+ "manipulados. O restante é passado para o próximo objetos de solicitação da cadeia.\n"
					+ " Devido a isso, é um padrão que utiliza a ideia de baixo acoplamento por permitir que ou-\n"
					+ "tros objetos da cadeia tenham a oportunidade de tratar uma solicitação.\n";
		
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
	}

}
