package utn.frre.prog2;

public interface IMyCollections<T> extends Iterable<T> {
    void add(T element);
    T remove();
    int length();
    boolean isEmpty();
}
