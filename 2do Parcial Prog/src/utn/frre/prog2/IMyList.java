package utn.frre.prog2;

public interface IMyList<T> extends IMyCollections<T> {
    T last();
    void remove(T element);
}
