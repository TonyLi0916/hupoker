package hupoker;

public class Main{
    public static void main(String[] args) {
        Card card = new Card(5, Card.Suit.SPADES);
        System.out.println(card.getCardNumber());
        System.out.println(card.getSuit());
        System.out.println(card.toString());
    }
}


