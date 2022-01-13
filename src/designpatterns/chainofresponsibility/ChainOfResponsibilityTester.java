package designpatterns.chainofresponsibility;

import app.TesterInterface;
import app.AbstractTester;

public class ChainOfResponsibilityTester  extends AbstractTester implements TesterInterface{
	private String title = "Chain Of Responsibility";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Em Orienta��o a Objetos, Chain of Responsibility � um padr�o GOF cuja principal fun��o \n"
					+ "� evitar a depend�ncia entre um objeto receptor e um objeto solicitante. Consiste em uma \n"
					+ "s�rie de objetos receptores e de objetos de solicita��o, onde cada objetos de solicita��o \n"
					+ "possui uma l�gica interna que separa quais s�o tipos de objetos receptores que podem ser \n"
					+ "manipulados. O restante � passado para o pr�ximo objetos de solicita��o da cadeia.\n"
					+ " Devido a isso, � um padr�o que utiliza a ideia de baixo acoplamento por permitir que ou-\n"
					+ "tros objetos da cadeia tenham a oportunidade de tratar uma solicita��o.\n";
		
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
