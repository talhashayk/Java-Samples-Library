
public class BinarySearchTreeNode<T extends Comparable<T>> {

	protected T element;
	protected BinarySearchTreeNode<T> left;
	protected BinarySearchTreeNode<T> right;

	protected BinarySearchTreeNode(Comparable<T> elem) {
		this.element = (T) elem;
		this.left = null;
		this.right = null;
	}

}
