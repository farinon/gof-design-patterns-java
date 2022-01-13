package designpatterns.bridge;

import app.TesterInterface;
import app.AbstractTester;

public class BridgeTester  extends AbstractTester implements TesterInterface{
	private String title = "Bridge";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Este padrão é um padrão utilizado quando é desejável que uma interface (abstração) \n"
					+ "possa variar independentemente das suas implementações. \n"
					+ "Imagine um sistema gráfico de janelas que deve ser portável para diversas plataformas.\n"
					+ " Neste sistema são encontrados diversos tipos de janelas, como ícones, diálogos, etc. \n"
					+ "Estas janelas formam uma hierarquia que contém uma abstração das janelas (classe base).\n"
					+ " Normalmente, a portabilidade seria obtida criando-se especializações dos tipos de jane-\n"
					+ "las para cada uma das plataformas suportadas. O problema com essa solução reside na com-\n"
					+ "plexidade da hierarquia gerada e na dependência de plataforma que existirá nos clientes \n"
					+ "do sistema.\n"
					+ "Através do padrão Bridge, a hierarquia que define os tipos de janelas é separada da hie-\n"
					+ "rarquia que contém a implementação. Desta forma todas as operações de Janela são abstra-\n"
					+ "tas e suas implementações são escondidas dos clientes.\n";
		
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
