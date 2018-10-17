package utn.frre.prog2;

public class King extends Piece {

    public King(ColorEnum color){
        name = "King";
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
