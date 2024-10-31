package hupoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // fields
    private List<Card> deck;

    // constructor
    public Deck() {
        deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()){
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        if (!deck.isEmpty()) {
            return deck.remove(deck.size() - 1);
        }
        else return null;
        }

    public boolean isEmpty(){
        return deck.isEmpty();
    }
}


