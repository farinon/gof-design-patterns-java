package designpatterns.visitor;

import app.TesterInterface;
import designpatterns.visitor.exemple.BinaryTree;
import designpatterns.visitor.exemple.ShowOrderedVisitor;
import designpatterns.visitor.exemple.ShowPostOrderVisitor;
import designpatterns.visitor.exemple.ShowPreOrderVisitor;
import app.AbstractTester;

public class VisitorTester  extends AbstractTester implements TesterInterface{
	private String title = "Visitor";
	@Override
	public void showAbstract() {
		showTitle(title);
		var content = "  Padrão de projeto comportamental que representa uma operação a ser realizada sobre \n"
					+ "elementos da estrutura de um objeto. O Visitor permite que se crie uma nova operação \n"
					+ "sem que se mude a classe dos elementos sobre as quais ela opera. É uma maneira de \n"
					+ "separar um algoritmo da estrutura de um objeto. Um resultado prático é a habilidade \n"
					+ "de adicionar novas funcionalidades a estruturas de um objeto pré-existente sem a neces-\n"
					+ "sidade de modificá-las.\n";
		
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
		BinaryTree tree = new BinaryTree(7);

		tree.insert(45);
		tree.insert(30);
		tree.insert(15);
		tree.insert(6);
		tree.insert(3);
		tree.insert(60);

		System.out.println("ARVORE BINARIA EM ORDEM:");
		tree.acceptVisitor(new ShowOrderedVisitor());
		
		System.out.println("ARVORE BINARIA EM PRE ORDEM:");
		tree.acceptVisitor(new ShowPreOrderVisitor());
		
		System.out.println("ARVORE BINARIA EM POS ORDEM:");
		tree.acceptVisitor(new ShowPostOrderVisitor());
		
		showMenu(title);


	}

}
