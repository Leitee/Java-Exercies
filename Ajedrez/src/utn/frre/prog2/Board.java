package utn.frre.prog2;

public class Board {
    private Cell[][] cells = new Cell[8][8];

    public void Move(Piece piece, Cell nextCell){
        Cell oldPosition = piece.getCurrentPosition();
        piece.Change(nextCell);
        System.out.println(String.format("The piece %s has been moved from s%", piece, oldPosition, nextCell));
    }
}
