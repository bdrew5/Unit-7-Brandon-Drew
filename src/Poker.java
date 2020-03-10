import java.util.ArrayList;

public class Poker extends CardGame {

    private ArrayList<Card> hand;
    private Deck deck;
    private String[] players;
    private int numPlayers;

    public Poker(String[] players,Deck deck) {
        super(players, deck);
        this.deck = deck;
        this.players = players;
        numPlayers = players.length;
        hand = new ArrayList<Card>();
    }

    public void deal() {
        Card card;
        for (int i = 0; i < deck.getLength(); i++) {
            if(i<players.length*2) {
                card = deck.getCard(i);
                hand.add(card);
            }
        }
    }

    public String toString() {
        String result = super.toString() + "\n[Poker]\n";
        if (hand.size() > 0) {
            for (String p : players) {
                result += p + "'s Hand: ";
                for (int i = 0; i < numPlayers; i++) {
                    if (p.equals(players[i]))
                        result += hand.get(i) + ", " + hand.get(i + numPlayers) + "\n";
                }
            }
        }
        else
            result+="No Cards Have Been Dealt";
        return result;
    }



    public static void main(String[] args){
        Deck deck = new Deck();
        deck.shuffle();
        String[] players = {"Brandon" , "Owen", "a","b","c","d","e"};
        Poker poker = new Poker(players,deck);
        System.out.println(poker);
        poker.deal();
        System.out.println(poker);
    }
}
