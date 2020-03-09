import java.util.ArrayList;

public class CardGame extends Game{
    private Deck deck;

    public CardGame(String[] players, Deck deck){
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
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.shuffle();
        String[] players = {"Brandon" , "Owen"};
        CardGame cardGame = new CardGame(players, deck);
        System.out.println(cardGame);
    }
}
