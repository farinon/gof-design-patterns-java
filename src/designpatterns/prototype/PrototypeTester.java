package designpatterns.prototype;

import app.TesterInterface;
import app.AbstractTester;

public class PrototypeTester  extends AbstractTester implements TesterInterface{
	private String title = "Prototype";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = " Padr�o de projeto de software criacional que permite a cria��o de novos objetos a \n"
					+ "partir de um modelo original ou prot�tipo que � clonado.\r\n"
				+ "Este padr�o pode ser utilizado para:\n"
				+ "- Evitar que as subclasses que criam objetos funcionem como o padr�o abstract factory;\n"
				+ "- Evitar criar um novo objeto utilizando a palavra new, o que diminui o custo de mem�ria.\n"
				+ "- Basicamente, ao em vez de o cliente implementar um c�digo que utiliza o operador new, \n"
				+ "este utiliza o m�todo clone() presente no prot�tipo e o m�todo de uma f�brica(Factory \n"
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
