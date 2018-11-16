package utn.frre.lab2;

import java.awt.*;

public abstract class Figure {
    private int id;
    protected float area;
    protected float perim;
    protected Coordinate point;

    public Figure(Coordinate cor) {
        this.point = cor;
    }

    public abstract float getArea();
    public abstract float getPerim();
    public abstract void draw(Graphics2D g);

}
