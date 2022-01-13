package designpatterns.proxy;

import app.TesterInterface;
import app.AbstractTester;

public class ProxyTester  extends AbstractTester implements TesterInterface{
	private String title = "Proxy";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Um proxy, em sua forma mais geral, é uma classe que funciona como uma interface \n"
				+ "para outra coisa. O proxy pode fazer interface com qualquer coisa: uma conexão de rede,\n"
				+ " um grande objeto na memória, um arquivo ou algum outro recurso caro ou impossível de \n"
				+ "duplicar. Resumindo, um proxy é um objeto wrapper (empacotador) ou agente que está sendo\n"
				+ " chamado pelo cliente para acessar o objeto de serviço real, nos bastidores. O uso do \n"
				+ "proxy pode simplesmente ser encaminhado para o objeto real ou pode fornecer lógica \n"
				+ "adicional. No proxy, funcionalidade extra pode ser fornecida, por exemplo, armazenamento\n"
				+ "em cache quando as operações no objeto real exigem muitos recursos ou verificação das \n"
				+ "pré-condições antes que as operações no objeto real sejam chamadas. Para o cliente, o \n"
				+ "uso de um objeto proxy é semelhante ao uso do objeto real, porque ambos implementam a \n"
				+ "mesma interface.\n"
				+ "\n"
				+ "Resumidamente, o padrão proxy possui três principais finalidades, sendo elas:\n"
				+ "- Prover um substituto (ou placeholder) para um outro objeto controlar seu acesso;\n"
				+ "- Usar um nível extra de indireção para fornecer acesso distribuído, controlado ou inteligente;\n"
				+ "- Adicionar um agregador e delegador para proteger o componente real de complexidade indevida.\n";
		
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
