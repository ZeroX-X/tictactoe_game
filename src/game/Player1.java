package game;

public class Player1 extends TicTacToe {
    private char x;
    private int scoretracker;
    
    // --------------Constructor-----------
    
    public Player1(String name, char x, int scoretracker){
        super(name);
        this.x = x;
        this.scoretracker = scoretracker;
    }
    
    @Override
    public void playername() {
       super.playername();
       System.out.println(" " + this.name);
    }

    @Override
    public void playerturn() {
       super.playerturn();
       System.out.println("" + this.x);
    }
    @Override
    public void movesound() {
        System.out.println("sound ticc");
    }
    @Override
    public void scoretracker() {
        System.out.println("winning stake: "+ this.scoretracker);
    }
}
 