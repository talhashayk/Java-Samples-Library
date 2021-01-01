
public final class BinaryNode<T> {

	T element;
	BinaryNode<T> left;
	BinaryNode<T> right;

	BinaryNode() {
		this(null);
	}

	public BinaryNode(T theElement) {
		this(theElement, null, null);
	}

	public BinaryNode(T theElement, BinaryNode<T> lt, BinaryNode<T> rt) {
		element = theElement;
		left = lt;
		right = rt;
	}

	static int size(BinaryNode t) {
		// Returns the size of the tree rooted at t.
		if (t == null) {
			return 0;
		} else {
			return 1 + Math.max(height(t.left), height(t.right));
		}

	}

	static int height(BinaryNode t) {
		// Returnsheight of tree rooted at t
		if (t == null) {
			return -1; // A single node has a tree height of 0
		} else {
			return 1 + Math.max(height(t.left), height(t.right));
		}
	}

	void printPreOrder() {
		System.out.println(element); // Node
		if (left != null) {
			left.printPreOrder(); // Left
		}
		if (right != null) {
			right.printPreOrder(); // Right
		}
	}

	void printInOrder() {
		if (left != null) {
			left.printInOrder(); // Left
		}
		System.out.println(element); // Node
		if (right != null) {
			right.printInOrder(); // Right
		}
	}

	void printPostOrder() {
		if (left != null) {
			left.printInOrder(); // Left
		}
		if (right != null) {
			right.printInOrder(); // Right
		}
		System.out.println(element); // Node
	}

	void printLevelOrder() {
	}

	BinaryNode<T> duplicate() {
		BinaryNode<T> root = new BinaryNode<T>(element);
		if (left != null) {
			root.left = left.duplicate();
		}
		if (right != null) {
			root.right = right.duplicate();
		}
		return root;
	}

}
