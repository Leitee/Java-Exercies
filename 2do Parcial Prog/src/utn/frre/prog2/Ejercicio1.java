package utn.frre.prog2;

public class Ejercicio1 {
    //Ambos se basan en la misma estructura de dato (pila)
    //La principal diferencia es que el metodo recuersivo es un metodo que se llama a si mismo
    //y con cada llamada se va apilando dichas llamadas en la pila.
    //cuando el ultimo ejecuta el caso base, se va devolviendo el control en el orden que fueron
    //apilados siendo el primer metodo en ejecutarse el ultimo.

    //En una estuructura de datos recursiva son objetos en memoria que los cuales tienen una asosiacion
    //con su mismo tipo de objeto. Como ser un Nodo que guarda la referencia de otro nodo el cual es de
    //su misma clase.

    //metodo recursivo
    public static int factorial(int numero) {
        return numero == 0 ? 1 : numero * factorial(numero -1);
    }

    //Recursividad de d
    static class SimpleNode<T> {
        public T Value;
        public SimpleNode<T> Next;

        public SimpleNode(T value) {
            this.Next = null;
            this.Value = value;
        }

        public boolean hasNext() {
            return Next != null;
        }
    }
}
