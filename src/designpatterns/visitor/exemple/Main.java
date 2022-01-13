package designpatterns.visitor.exemple;

public class Main {

	public static void main(String[] args) {
		
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

	}
}