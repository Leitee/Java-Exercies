package utn.frre.prog2;

abstract class NodeBase<T> {
    protected T Value;

    @Override
    public String toString() {
        return Value.toString();
    }
}
