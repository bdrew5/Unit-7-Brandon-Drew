public class Game {
    private int numOfTurns = 0;
    private String[] players;

    public Game(String[] players){
        this.players = players;
    }

    public void nextTurn(){
        numOfTurns++;
    }

    public String toString(){
        String result ="Game: \n";
        for(String p : players){
            result += p + " ";
        }
        return result;
    }

}

