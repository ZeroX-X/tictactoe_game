package game;

abstract public class TicTacToe {
    protected String name; 
    private char[][] board;
         // ------------------Constructor--------------------    
    public TicTacToe(char[][] board){
        this.board = board;
        board = new char[3][3];
    }

    public TicTacToe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playername(){
        System.out.print("Player's name: ");
    }

    public void playerturn(){
        System.out.print("Player's turn: ");
    }

    public void scoretracker(){
        // System.out.println("winning stake: ");
    }
    abstract public void movesound();

}



