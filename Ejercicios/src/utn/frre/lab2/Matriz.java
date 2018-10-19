package utn.frre.lab2;

public class Matriz {
    private int filas;
    private int columnas;
    private int[][] dato;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public Matriz multiiplicar(Matriz mtz) {
        Matriz resul = new Matriz(this.getFilas(), mtz.getColumnas());

        if (this.getFilas() != mtz.getColumnas()) {
            throw new RuntimeException("Las dimensiones de las matrices no son aptas para esta operacion.");
        }

        for (int fila = 0; fila < this.getFilas(); fila++) {
            for (int columna = 0; columna < mtz.getColumnas(); columna++) {
                for (int k = 0; k < this.getFilas(); k++) {
                    resul.getDato()[fila][columna] += this.getDato()[fila][k] * mtz.getDato()[k][columna];
                }
            }
        }

        return resul;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int[][] getDato() {
        return dato;
    }

    public void setDato(int[][] dato) {
        this.dato = dato;
    }
}
