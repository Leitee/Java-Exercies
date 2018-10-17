package utn.frre.prog2;
import utn.frre.prog2.ColorEnum;

public abstract class Piece {

    protected ColorEnum color;
    protected String name;
    private Cell currentPosition;

    protected abstract void Change(Cell nextCell);

    public void setCurrentPosition(Cell currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Cell getCurrentPosition() {
        return currentPosition;
    }
}
