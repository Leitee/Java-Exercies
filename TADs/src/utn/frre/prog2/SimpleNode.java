package utn.frre.prog2;

class SimpleNode<T> extends NodeBase<T> {
    public SimpleNode<T> Next;

    public SimpleNode(T value) {
        this.Next = null;
        this.Value = value;
    }

    public boolean hasNext() {
        return Next != null;
    }
}