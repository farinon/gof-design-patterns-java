package designpatterns.visitor.exemple;

public class No {

	protected int chave;
	No esquerdo, direito;

	public No(int chave) {
		this.chave = chave;
		esquerdo = null;
		direito = null;
	}

	public String toString() {
		return String.valueOf(chave);
	}

	public int getKey() {
		return chave;
	}

	public No getLeft() {
		return esquerdo;
	}

	public void setLeft(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public No getRight() {
		return direito;
	}

	public void setRight(No direito) {
		this.direito = direito;
	}

}