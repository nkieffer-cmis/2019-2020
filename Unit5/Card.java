public class Card implements Comparable
{
    private int rank;
    private int suit;
    
    public Card(int rank, int suit){
        this.suit = suit;
        this.rank = rank;
    }
    
    public int compareTo(Object other){
        return this.rank - ((Card)other).rank;
    }
    
    public static Card randomCard(){
        int suit = (int)(Math.random() * 4);
        int rank = (int)(Math.random() * 13) + 1;
        return new Card(rank, suit);
    }
    
    public String toString(){
        String out;
        if(suit == 0){
            out = "C";
        }else if (suit == 1){
            out = "S";
        }else if (suit == 2){
            out = "D";
        }else{
            out = "H";
        }
        
        if (rank > 10){
            if(rank == 11)
                out = "J" + out;
            else if (rank == 12)
                out = "Q" + out;
            else if (rank == 13)
                out = "K" + out;
            else
                out = "A" + out;
           
        }else{
            out = rank + out;
        }
        return out;
    }
    
    public static void main(String[] argv){

    }
}
