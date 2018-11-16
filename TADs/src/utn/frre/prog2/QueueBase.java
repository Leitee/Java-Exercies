package utn.frre.prog2;

import java.util.Iterator;

abstract class QueueBase<Node extends NodeBase, T> {
    protected int size;
    protected Node first;
    protected Node last;

    public QueueBase() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public abstract void add(T element);

    public abstract T remove();

    public int length() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.first == null;
    }
}
