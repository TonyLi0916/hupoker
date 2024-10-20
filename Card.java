package hupoker;

public class Card {
    public enum Suit{
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
    // fields
    private int cardNumber;
    private Suit suit;

    // constructor
    public Card(int cardNumber, Suit suit){
        this.cardNumber = cardNumber;
        this.suit = suit;
    }
    // setters
    public void setCardNumber(int newCardNumber){
        this.cardNumber = newCardNumber;
    }
    public void setSuit(Suit newSuit){
        this.suit = newSuit;
    }
    // getters
    public int getCardNumber() {
        return cardNumber;
    }
    public Suit getSuit(){
        return suit;
    }
    @Override
    public String toString(){
        String[] cardNumberRank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return cardNumberRank[this.cardNumber - 1] + " of " + this.suit;
    }
}
