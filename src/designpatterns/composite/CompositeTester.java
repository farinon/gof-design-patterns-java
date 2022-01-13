package designpatterns.composite;

import app.TesterInterface;
import app.AbstractTester;

public class CompositeTester  extends AbstractTester implements TesterInterface{
	private String title = "Composite";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Este padr�o de projeto de software � utilizado para representar um objeto formado \n"
					+ "pela composi��o de objetos similares. Este conjunto de objetos pressup�e uma mesma \n"
					+ "hierarquia de classes a que ele pertence. Tal padr�o �, normalmente, utilizado para \n"
					+ "representar listas recorrentes - ou recursivas - de elementos. Al�m disso, este modo \n"
					+ "de representa��o hier�rquica de classes permite que os elementos contidos em um \n"
					+ "objeto composto sejam tratados como se fossem um objeto �nico. Desta forma, os m�to-\n"
					+ "dos comuns �s classes podem ser aplicados, tamb�m, ao conjunto agrupado no objeto com-\n"
					+ "posto.\n";
		
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
