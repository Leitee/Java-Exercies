package utn.frre.prog2;

class BinaryNode<T> extends NodeBase<T> {
    public BinaryNode<T> LeftChild;
    public BinaryNode<T> RightChild;

    public BinaryNode(T value) {
        this.LeftChild = null;
        this.RightChild = null;
        this.Value = value;
    }

    public boolean isLeaf() {
        return LeftChild == null && RightChild == null;
    }
}
