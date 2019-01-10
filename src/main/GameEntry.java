package main;

public class GameEntry {
    String name;
    int score;
    //getter method for name and score
    //constructor to initialize members attributes of class

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "(" + name+" , + score +
                ')";
    }
}
class Scoreboard {
    private int numEntries = 0;
    private GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry gameEntry) {
        //attemps to add a new score to the board (if it is high enough)
        int newScore = gameEntry.score;
        if(numEntries < board.length || newScore > board[numEntries - 1].score)
        {
            if(numEntries < board.length)
            {
                numEntries++;
            }
            int j = numEntries - 1;
            while(j > 0)
        }
        Arrays.sort(board);
       if(gameEntry.score > board[0].score)
       {
           board[0] = gameEntry;
       }

    }

    public void remove(int index) {

    }
}

    public static void main(String[] args) {
        GameEntry gameEntry = new GameEntry(name:"Rati Sankar", score:100);
        Scoreboard scoreboard = new Scoreboard(capacity:5);


    }