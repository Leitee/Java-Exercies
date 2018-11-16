package utn.frre.prog2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyGrafo<T> {
    private T[] vertices;
    private int[][] matAdyacencias;
    private int size;

    public MyGrafo(T... vertices) {
        this.vertices = vertices;
        size = vertices.length;
        this.matAdyacencias = new int[size][size];
        for (int[] row: matAdyacencias)
            Arrays.fill(row, 0);
    }

    public void conectar(int a, int b, int peso) {
        for (int fila = 0; fila < size; fila++) {
            for (int columna = 0; columna < size; columna++) {
                if(fila == a || columna == b) {
                    matAdyacencias[a-1][b-1] = peso;
                }
            }
        }
    }

    public void printMatriz() {
        for (int fila = 0; fila < size; fila++) {
            for (int columna = 0; columna < size; columna++) {
                System.out.print(matAdyacencias[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
