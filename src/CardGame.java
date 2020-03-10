import java.util.ArrayList;

public class CardGame extends Game{
    private Deck deck;

    public CardGame(ArrayList<String> players, Deck deck){
        super(players);
        this.deck = deck;
    }

    public String toString(){
        ArrayList<Card> cards = deck.getDeck();
        String result = super.toString() + "\n[Card Game]\n" ;
        for(Card c : cards){
            result += c + " ";
        }
        return result;
    }
    public void nextTurn(){
        super.nextTurn();
    }
}
