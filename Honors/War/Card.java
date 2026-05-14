public class Card {
    int value;
    String suit;
    
    public Card (int v, String s){
        value = v;
        suit = s.toUpperCase();
    }
    
    public int getValue(){return value;}
    public String getSuit(){return suit;}
    public int getSuitVal() {
        if (suit == "DIAMONDS") {
            return 4;
        } else if (suit == "HEARTS") {
            return 3;
        } else if (suit == "SPADES") {
            return 2;
        } else if (suit == "CLUBS") {
            return 1;
        } else {
            return 0;
        }
    }
    public String toString(){
        return suit + " " + value;
    }
}
