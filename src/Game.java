import java.util.ArrayList;

public class Game {
    private int numOfTurns = 0;
    private ArrayList<String> players;

    public Game(ArrayList<String> players){
        this.players = players;
    }

    public void nextTurn(){
        numOfTurns++;
    }

    public String toString(){
        String result ="Players: \n";
        for(String p : players){
            result += p + " ";
        }
        return result + "\nRound Number: "+numOfTurns;
    }

}

