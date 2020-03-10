import java.util.*;
public class Deck
{
    ArrayList<Card> cards = new ArrayList<Card>();
    public Deck(){
        initDeck();
    }
    
    public Deck(int nDecks){
        while(nDecks > 0){
            initDeck();
            nDecks--;
        }
    }
    
    private void initDeck(){
        for(int suit = 0; suit < 4; suit++){
            for(int rank = 2; rank < 15; rank++){
                cards.add(new Card(rank, suit));
            }
        }
    }
    public void shuffle(){
        for(int i = 0; i < cards.size(); i++){
            Card c = cards.remove(i);
            cards.add((int)(Math.random() * cards.size()), c);
        }
    }
    
    public Card deal(){
        return cards.remove(0);
    }
    public int size(){
        return cards.size();
    }
    public String toString(){
        String out = "";
        for(Card c: cards){
            out += c + " ";
        }
        return out;
    }
    
    public static void main(String[] argv){
        Deck deck = new Deck(3);
        System.out.println(deck);
        System.out.println(deck.size());
        deck.shuffle();
        System.out.println(deck);
        System.out.println(deck.size());
    }
}
