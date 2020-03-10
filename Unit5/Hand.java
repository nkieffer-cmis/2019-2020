import java.util.*;
public class Hand
{
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    public Hand(ArrayList<Card> cards){
        this.cards = cards;
    }
    
    public Hand(){};
    public Card discard(int idx){
        return cards.remove(idx);
    }
    
    public void draw(Card newCard){
        cards.add(newCard);
        Collections.sort(cards);
    }
    
    public String toString(){
        String out = "";
        for(Card c: cards){
            out += c + " ";
        }
        return out;
    }
    
    public static void main(String[] argv){
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        Deck deck = new Deck();
        deck.shuffle();
        for(int i = 0; i < 5; i++){
            hand1.draw(deck.deal());
            hand2.draw(deck.deal());
        }
        
        System.out.println(hand1);  
        System.out.println(hand2);
        for(int i = 0; i < 2; i++){
            hand1.draw(deck.deal());
            hand2.draw(deck.deal());
            System.out.println(hand1);  
            System.out.println(hand2);
        }   
    }   
}
