
public class BinaryTree<T> {

	private BinaryNode<T> root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(T rootItem) {
		root = new BinaryNode(rootItem);
	}

	public void printPreOrder() {
		if (root != null) {
			root.printPreOrder(); // Left
		}
	}

	public void printInOrder() {
		if (root != null) {
			root.printInOrder(); // Left
		}
	}

	public void printPostOrder() {
		if (root != null) {
			root.printPostOrder(); // Left
		}
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void makeEmpty() {
		root = null;
	}

	public int size() {
		return BinaryNode.size(root);
	}

	public int height() {
		return BinaryNode.height(root);
	}

	public void duplicate(BinaryTree rhs) {
		if (this != rhs) {
			root = rhs.root.duplicate();
		}
	}

}
