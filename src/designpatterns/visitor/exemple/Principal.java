package designpatterns.visitor.exemple;

public class Principal {

	public static void main(String[] args) {
		
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