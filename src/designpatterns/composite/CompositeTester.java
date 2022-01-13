package designpatterns.composite;

import app.TesterInterface;
import app.AbstractTester;

public class CompositeTester  extends AbstractTester implements TesterInterface{
	private String title = "Composite";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Este padrão de projeto de software é utilizado para representar um objeto formado \n"
					+ "pela composição de objetos similares. Este conjunto de objetos pressupõe uma mesma \n"
					+ "hierarquia de classes a que ele pertence. Tal padrão é, normalmente, utilizado para \n"
					+ "representar listas recorrentes - ou recursivas - de elementos. Além disso, este modo \n"
					+ "de representação hierárquica de classes permite que os elementos contidos em um \n"
					+ "objeto composto sejam tratados como se fossem um objeto único. Desta forma, os méto-\n"
					+ "dos comuns às classes podem ser aplicados, também, ao conjunto agrupado no objeto com-\n"
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
