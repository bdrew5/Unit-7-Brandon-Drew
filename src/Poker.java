import java.util.ArrayList;

public class Poker extends CardGame {

    private ArrayList<Card> hand;
    private Deck deck;
    private ArrayList<String> players;
    private int numPlayers;


    public Poker(ArrayList<String> players,Deck deck) {
        super(players, deck);
        this.deck = deck;
        this.players = players;
        numPlayers = players.size();
        hand = new ArrayList<Card>();
    }

    public void deal() {
        Card card;
        super.nextTurn();
        for (int i = 0; i < deck.getLength(); i++) {
            if(i<players.size()*2) {
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
                    if (p.equals(players.get(i)))
                        result += hand.get(i) + ", " + hand.get(i + numPlayers) + "\n";

                }
            }
        }
        else
            result+="No Cards Have Been Dealt";
        if(cardTurned.size() == 0)

        return result;
    }

    public void fold(int playerNum){
        if(hand.size() != 0) {
            Card folded = new Card("Fold","ed");
            hand.remove(playerNum -1);
            hand.remove(playerNum + numPlayers - 2);
            hand.add(playerNum -1, folded);
            hand.add(playerNum + numPlayers - 1, folded);
        }
    }
    public void river(){

    }

    public static void main(String[] args){
        Deck deck = new Deck();
        deck.shuffle();
        ArrayList<String> players = new ArrayList<String>();
        players.add("a");
        players.add("b");
        players.add("c");
        players.add("d");
        players.add("e");
        Poker poker = new Poker(players,deck);
        System.out.println(poker);
        poker.deal();
        System.out.println(poker);
        poker.fold(1);
        poker.fold(2);
        poker.fold(3);
        poker.fold(4);
        poker.fold(5);
        System.out.println(poker);
    }
}
