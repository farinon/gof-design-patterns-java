package designpatterns.prototype;

import app.TesterInterface;
import app.AbstractTester;

public class PrototypeTester  extends AbstractTester implements TesterInterface{
	private String title = "Prototype";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Padrão de projeto de software criacional que permite a criação de novos objetos a \n"
					+ "partir de um modelo original ou protótipo que é clonado.\r\n"
				+ "Este padrão pode ser utilizado para:\n"
				+ "- Evitar que as subclasses que criam objetos funcionem como o padrão abstract factory;\n"
				+ "- Evitar criar um novo objeto utilizando a palavra new, o que diminui o custo de memória.\n"
				+ "- Basicamente, ao em vez de o cliente implementar um código que utiliza o operador new, \n"
				+ "este utiliza o método clone() presente no protótipo e o método de uma fábrica(Factory \n"
				+ "Method ou Abstratct Factory) que fica encarregada de clonar o novo objeto.\n";
		
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
		PalioPrototype prototipoPalio = new PalioPrototype();
		 
	    CarroPrototype palioNovo = prototipoPalio.clonar();
	    palioNovo.setValorCompra(27900.0);
	    CarroPrototype palioUsado = prototipoPalio.clonar();
	    palioUsado.setValorCompra(21000.0);
	 
	    System.out.println(palioNovo.exibirInfo());
	    System.out.println(palioUsado.exibirInfo());
	}

}
