package utn.frre.prog2;

public class MyBinaryQueue<T> extends QueueBase<SimpleNode, T> {

    @Override
    public void add(T element) {
            SimpleNode<T> newNode = new SimpleNode(element);

        if (this.isEmpty()) {
            this.first = newNode;
            this.last = newNode;
        }
        else {
            this.last.Next = newNode;
        }
    }

    @Override
    public T remove() {
        if (isEmpty())
            throw new RuntimeException("This list is empty.");

        T temp = (T)this.first.Value;
        this.first = first.Next;
        this.size --;

        return temp;
    }
}
