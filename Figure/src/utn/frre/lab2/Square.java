package utn.frre.lab2;

import java.awt.*;

public class Square extends Figure {
    private float heigth;
    private float width;

    public Square(float heigth, float width, Coordinate cor) {
        super(cor);
        this.heigth = heigth;
        this.width = width;
    }

    @Override
    public float getArea() {
        area = heigth * width;
        return area;
    }

    @Override
    public float getPerim() {
        perim = (heigth + width) * 2;
        return perim;
    }

    @Override
    public void draw(Graphics2D g) {

    }
}
