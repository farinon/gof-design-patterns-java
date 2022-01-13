package designpatterns.visitor.exemple;

public class BinaryTree {
	No root;
	int elementsCount;

	public BinaryTree(int rootKey) {
		root = new No(rootKey);
		elementsCount = 0;
	}

	public void insert(int key) {
		insert(key, root);
	}

	public void remove(int key) {
	}

	public void get(int key) {

	}

	private void insert(int key, No no) {
		if (no.getKey() == key)
			return;
		if (key > no.getKey()) {
			if (no.getRight() == null) {
				no.setRight(new No(key));
				elementsCount++;
				return;
			}
			insert(key, no.getRight());
		} else {
			if (no.getLeft() == null) {
				no.setLeft(new No(key));
				elementsCount++;
				return;
			}
			insert(key, no.getLeft());
		}
	}

	public void acceptVisitor(TreeVisitor visitor) {
		visitor.visit(root);
	}
}