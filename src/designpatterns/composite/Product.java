
// LEAF (FOLHA)

// A classe Produto implementa a interface Item, representando um Produto simples.

package designpatterns.composite;

public class Product implements Item {
	private String name;
	private double price;
	
	public Product(String nome, double preco) {
		this.name = nome;
		this.price = preco;
	}

	// Retorna o preço do produto
	@Override
	public double calculateFinalPrice() {
		return price;
	}

}


