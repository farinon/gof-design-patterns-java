package designpatterns.bridge;

import app.TesterInterface;
import app.AbstractTester;

public class BridgeTester  extends AbstractTester implements TesterInterface{
	private String title = "Bridge";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este padr�o � um padr�o utilizado quando � desej�vel que uma interface (abstra��o) \n"
					+ "possa variar independentemente das suas implementa��es. \n"
					+ "Imagine um sistema gr�fico de janelas que deve ser port�vel para diversas plataformas.\n"
					+ " Neste sistema s�o encontrados diversos tipos de janelas, como �cones, di�logos, etc. \n"
					+ "Estas janelas formam uma hierarquia que cont�m uma abstra��o das janelas (classe base).\n"
					+ " Normalmente, a portabilidade seria obtida criando-se especializa��es dos tipos de jane-\n"
					+ "las para cada uma das plataformas suportadas. O problema com essa solu��o reside na com-\n"
					+ "plexidade da hierarquia gerada e na depend�ncia de plataforma que existir� nos clientes \n"
					+ "do sistema.\n"
					+ "Atrav�s do padr�o Bridge, a hierarquia que define os tipos de janelas � separada da hie-\n"
					+ "rarquia que cont�m a implementa��o. Desta forma todas as opera��es de Janela s�o abstra-\n"
					+ "tas e suas implementa��es s�o escondidas dos clientes.\n";
		
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
