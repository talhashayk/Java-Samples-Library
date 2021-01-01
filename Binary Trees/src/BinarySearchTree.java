
public class BinarySearchTree<T extends Comparable<T>> {

	private BinarySearchTreeNode<T> root;

	public BinarySearchTree() {
		root = null;
	}

	public BinarySearchTreeNode<T> search(Comparable<T> target) {
		int direction = 0; // 0 for here <0 for less >0 for more.
		BinarySearchTreeNode<T> current = root;
		for (;;) {
			if (current == null) {
				return null;
			}
			direction = target.compareTo(current.element);
			if (direction == 0) {
				return current;
			} else if (direction < 0) {
				return current.left;
			} else if (direction > 0) {
				return current.right;
			}
		}
	}

	public void insert(Comparable<T> elem) {
		int direction = 0;
		BinarySearchTreeNode<T> parent = null;
		BinarySearchTreeNode<T> current = root;
		for (;;) {
			if (current == null) {
				BinarySearchTreeNode<T> ins = new BinarySearchTreeNode(elem);
				if (root == null) {
					root = ins;
				} else if (direction < 0) {
					parent.left = ins;
				} else {
					parent.right = ins;
				}
			} else {
				direction = elem.compareTo(current.element);
				if (direction == 0) {
					return; // dont insert duplicates
				}
				parent = current;
				if (direction < 0) {
					current = current.left;
				} else {
					current = current.right;
				}
			}
		}
	}

}
