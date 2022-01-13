package designpatterns.visitor;

import app.TesterInterface;
import designpatterns.visitor.exemple.ArvoreBinaria;
import designpatterns.visitor.exemple.ExibirInOrderVisitor;
import designpatterns.visitor.exemple.ExibirPostOrderVisitor;
import designpatterns.visitor.exemple.ExibirPreOrdemVisitor;
import app.AbstractTester;

public class VisitorTester  extends AbstractTester implements TesterInterface{
	private String title = "Visitor";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Padr�o de projeto comportamental que representa uma opera��o a ser realizada sobre \n"
					+ "elementos da estrutura de um objeto. O Visitor permite que se crie uma nova opera��o \n"
					+ "sem que se mude a classe dos elementos sobre as quais ela opera. � uma maneira de \n"
					+ "separar um algoritmo da estrutura de um objeto. Um resultado pr�tico � a habilidade \n"
					+ "de adicionar novas funcionalidades a estruturas de um objeto pr�-existente sem a neces-\n"
					+ "sidade de modific�-las.\n";
		
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
		ArvoreBinaria arvore = new ArvoreBinaria(7);

		arvore.inserir(45);
		arvore.inserir(30);
		arvore.inserir(15);
		arvore.inserir(6);
		arvore.inserir(3);
		arvore.inserir(60);

		System.out.println("ARVORE BINARIA EM ORDEM:");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());
		
		System.out.println("ARVORE BINARIA EM PRE ORDEM:");
		arvore.aceitarVisitante(new ExibirPreOrdemVisitor());
		
		System.out.println("ARVORE BINARIA EM POS ORDEM:");
		arvore.aceitarVisitante(new ExibirPostOrderVisitor());

	}

}
