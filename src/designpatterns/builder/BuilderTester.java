package designpatterns.builder;

import app.TesterInterface;
import app.AbstractTester;

public class BuilderTester  extends AbstractTester implements TesterInterface{
	private String title = "Builder";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este padrão é um padrão de projeto de software criacional que permite a separação \n"
				+ "da construção de um objeto complexo da sua representação, de forma que o mesmo pro- \n"
				+ "cesso de construção possa criar diferentes representações.\n"
				+ "  Exemplo de utilização do padrão Builder seria em uma aplicação que converte o for-\n"
				+ "mato de texto RTF para uma série de outros formatos e que permite a inclusão de su-\n"
				+ "porte para conversão para outros formatos, sem a alteração do código fonte do leitor \n"
				+ "de RTF.\n";
		
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
