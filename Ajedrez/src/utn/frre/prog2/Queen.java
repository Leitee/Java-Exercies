package utn.frre.prog2;

public class Queen extends Piece {
    public Queen(ColorEnum color){
        name = "Queen";
        color = color;
    }

    @Override
    protected void Change(Cell nextCell) {

    }

    @Override
    public String toString() {
        return name;
    }
}
