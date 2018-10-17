package utn.frre.prog2;

public class Player {
    private String nickName;
    private ColorEnum choosedColor;
    private boolean isTurn;
    private Piece[] pieces;

    public Player (String name, ColorEnum color){
        this.nickName = name;
        this.choosedColor = color;

        pieces = new Piece[16];

        pieces[0] = new King(color);
        pieces[1] = new Queen(color);
        //so on...
    }
}
