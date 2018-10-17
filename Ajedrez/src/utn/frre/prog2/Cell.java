package utn.frre.prog2;

public class Cell {
    private ColorEnum color;
    private String row;
    private String column;
    private Piece piece;



    public ColorEnum getColor() {
        return color;
    }

    public String getRow() {
        return row;
    }

    public String getColumn() {
        return column;
    }

    public Piece getPiece() {
        return piece;
    }


    public void setPiece(Piece piece) {
        piece.setCurrentPosition(this);
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "'Position: " + getRow() + getColumn() + "'";
    }
}
