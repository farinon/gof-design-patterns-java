package designpatterns.mediator;

import app.TesterInterface;
import app.AbstractTester;

public class MediatorTester  extends AbstractTester implements TesterInterface{
	private String title = "Meditor";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Este padrão é usado frequentemente quando deseja-se encapsular como os objetos\n"
					+ " interagem, ou seja, a comunicação entre os objetos é estabelecida através do \n"
					+ "Mediator. Este padrão é considerado um padrão comportamental, pois o padrão pode\n"
					+ " alterar o comportamento da aplicação (programa).O Mediator promove o fraco aco-\n"
					+ "plamento ao evitar que objetos se referiram uns aos outros explicitamente.\n";
		
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
