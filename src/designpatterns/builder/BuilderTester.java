package designpatterns.builder;

import app.TesterInterface;
import app.AbstractTester;

public class BuilderTester  extends AbstractTester implements TesterInterface{
	private String title = "Builder";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este padr�o � um padr�o de projeto de software criacional que permite a separa��o \n"
				+ "da constru��o de um objeto complexo da sua representa��o, de forma que o mesmo pro- \n"
				+ "cesso de constru��o possa criar diferentes representa��es.\n"
				+ "  Exemplo de utiliza��o do padr�o Builder seria em uma aplica��o que converte o for-\n"
				+ "mato de texto RTF para uma s�rie de outros formatos e que permite a inclus�o de su-\n"
				+ "porte para convers�o para outros formatos, sem a altera��o do c�digo fonte do leitor \n"
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
