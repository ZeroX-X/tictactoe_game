package game;

public class Player2 extends TicTacToe {
    char o;
    int scoretracker;
     
    // -----------Constructor-------------
    
    public Player2(String name, char o, int scoretracker){
        super(name);
        this.o = o;
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
        System.out.println("" + this.o);
    }
    @Override
    public void movesound() {
        System.out.println("sound tocc");
    }
    @Override
    public void scoretracker() {
        System.out.println("winning stake: " + this.scoretracker);
    }
   
}
 