package utn.frre.lab2;

import java.util.LinkedList;
import java.util.List;

public class Dash {
    private float height;
    private float width;
    private int maxVolume;
    private List<Figure> figures;

    public Dash(float h, float w, int vol) {
        this.maxVolume = vol;
        this.width = w;
        this.height = h;
        figures = new LinkedList<Figure>();
    }

    private float getArea() {
        return height * width;
    }

    private float getTakenArea() {
        float total = 0;
        for(Figure fig : figures) {
            total += fig.getArea();
        }
        return total;
    }

    public void addFigure(Figure fig) {

    }

}
