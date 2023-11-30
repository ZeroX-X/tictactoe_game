
package game;

public class test {
    public static void main(String[] args) {
        Player1 p1 = new Player1("Nichhay", 'x', 10);
        Player2 p2 = new Player2("Raseth", 'o', 10);
        TicTacToe t = new Player1("ZeroX", 'z', 10 );  //polymorphism
        t.playername();
        p2.playername();
        t.playerturn();
        p2.playerturn();
        p1.movesound();
        p2.movesound();
        p1.scoretracker();
        p2.scoretracker();
        t.scoretracker();
    }
}
