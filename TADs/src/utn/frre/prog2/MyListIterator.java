package utn.frre.prog2;

import java.util.Iterator;

class MyListIterator<T> implements Iterator<T> {
    private SimpleNode<T> current;

    public MyListIterator(SimpleNode<T> first) {
        this.current = first;
    }

    @Override
    public boolean hasNext() {
        return this.current.Next != null;
    }

    @Override
    public T next() {
        T value = current.Value;
        current = current.Next;
        return value;
    }
}
