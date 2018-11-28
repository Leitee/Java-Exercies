package utn.frre.prog2;

import java.util.Iterator;

public class MyList<T> implements IMyList<T> {
    private int count;
    private SimpleNode<T> first;

    public MyList() {
        this.count = 0;
        this.first = null;
    }

    @Override
    public T last() {
        return getLast().Value;
    }

    @Override
    public void remove(T element) {
        if (isEmpty())
            throw new RuntimeException("This list is empty.");

        if (!first.hasNext()) {
            first = null;
        }else {
            SimpleNode temp = first;
            SimpleNode prev = temp;

            while (temp.hasNext()) {
                prev = temp;
                temp = temp.Next;
            }

            prev.Next = null;
        }
        count --;
    }

    @Override
    public void add(T element){
        SimpleNode newNode = new SimpleNode(element);

        if (this.isEmpty()) {
            first = newNode;
        } else {
            SimpleNode last = this.getLast();
            last.Next = newNode;
        }
        this.count ++;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public int length() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[ ");
        SimpleNode<T> temp = this.first;

        for (int i = 0; i < this.length(); i++) {
            str.append(temp).append(" ");
            temp = temp.Next;
        }
        str.append("]");
        return String.join(",", str.toString());
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(first);
    }

    private SimpleNode<T> getLast(){
        SimpleNode<T> temp = this.first;
        while (temp.hasNext()) {
            temp = temp.Next;
        }
        return temp;
    }
}
