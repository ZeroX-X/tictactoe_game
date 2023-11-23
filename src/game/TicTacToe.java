package game;

public class TicTacToe {
    private char[][] board;
    private boolean gameOver;
    private Player currentPlayer;
    private Player winner;
    private int timeLimit;
    private Player player1;
    private Player player2;
    private ScoreTracker scoreTracker;

    public TicTacToe(char[][] board, boolean gameOver, Player currentPlayer, Player winner,  int timeLimit, Player player1, Player player2,  ScoreTracker scoretracker) {
        this.board = new char[3][3];
        this.gameOver = false;
        this.currentPlayer = player1;
        this.winner = null;    // (no winner yet)
        this.timeLimit = timeLimit;
        this.player1 = player1;
        this.player2 = player2;
        this.scoreTracker = new ScoreTracker();
    }
}
//--------------------------------------constructor----------------------------------------------------
// Player class
class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
// ScoreTracker class
class ScoreTracker {
    private int player1Score;
    private int player2Score;

    public ScoreTracker() {
        this.player1Score = 0;
        this.player2Score = 0;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }
}
//
