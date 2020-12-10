package ztu.cards;

/**
 * This is a template for modelling a deck of cards.
 *
 * This is intended to be a standard deck of 52 cards as: https://en.wikipedia.org/wiki/Standard_52-card_deck
 *
 * The intention of this exercise is to implement the method stubs below
 */
public class Deck
{
    public Deck(){}

    /**
     * This will change the order of the cards in to a random order.
     * Math.random() is allowed, but no shuffle methods of collections.
     */
    public void shuffle(){
        //TODO: Implement shuffle
    }




    public static void main( String[] args )
    {
        Deck deck = new Deck();
        long start = System.currentTimeMillis();
        int shuffles = 1000000;
        for(int i = 0; i < shuffles; i++){
            deck.shuffle();
        }
        long end = System.currentTimeMillis();

        long duration = end - start;

        System.out.println("Time for " + shuffles + " was " + duration);
    }
}
