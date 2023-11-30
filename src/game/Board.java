package game;

public class Board extends TicTacToe {
    public Board(char[][] board){
        super(board);
    }
    
    @Override
    public void movesound() {
        System.out.println("ticctocc");
    }
}
