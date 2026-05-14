import java.util.*;
public class War {
    private ArrayList <Card> deck;
    private ArrayList <Card> pDeck1;
    private ArrayList <Card> pDeck2;
     
    
    public War(){
        deck = new ArrayList<Card>();
        pDeck1 = new ArrayList<Card>();
        pDeck2 = new ArrayList<Card>();
        // write the constructor.
        // fill the deck arraylist with 
        // all 52 cards 
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                switch(j) {
                    case 0:
                        deck.add(new Card(i, "SPADES"));
                        break;
                    case 1:
                        deck.add(new Card(i, "HEARTS"));
                        break;
                    case 2:
                        deck.add(new Card(i, "DIAMONDS"));
                        break;
                    case 3:
                        deck.add(new Card(i, "CLUBS"));
                        break;
                    default:
                        break;
                }
            }
        }
        
        deal();
    }
    
    public void deal () {
        // randomly deal the cards rom deck to pDeck1 and pDeck2.
        // each players' hand should have 26 cards
        Random r = new Random();
        for (int i = 51; i >= 0; i--) {
            if (pDeck1.size() == 26) {
                pDeck2.add(deck.get(i));
            } else if (pDeck2.size() == 26) {
                pDeck1.add(deck.get(i));
            } else {
                int x = r.nextInt(2);
                if (x == 0) {
                    pDeck1.add(deck.get(i));
                } else if (x == 1) {
                    pDeck2.add(deck.get(i));
                }
            }
            deck.remove(i);
        }
    }
    
    public boolean compareCards (Card d, Card p){
        return ((d.getSuitVal() > p.getSuitVal()) || (d.getValue() > p.getValue()));
    }
    public void play(){
        //compare the top two cards of each deck.
        //the player with the card of greater value
        //gets the card.
        //game ends when the player quits or when
        //either deck has only 10 cards left
        
        
        System.out.println(pDeck1);
        System.out.println();
        System.out.println(pDeck2);
        System.out.println();
        
        while (true) {
            System.out.print("[p1] " + pDeck1.get(0).toString());
            System.out.println("  [p2] " + pDeck2.get(0).toString());
            
            if (compareCards(pDeck1.get(0), pDeck2.get(0))) {
                // give to p1
                System.out.println("Cards go to p1");
                pDeck1.add(pDeck2.get(0));
                pDeck2.remove(0);
                
                pDeck1.add(pDeck1.get(0));
                pDeck1.remove(0);
            } else {
                // give to p2
                System.out.println("Cards go to p2");
                pDeck2.add(pDeck1.get(0));
                pDeck1.remove(0);
                
                pDeck2.add(pDeck2.get(0));
                pDeck2.remove(0);
            }
            
            if (pDeck1.size() == 10) {
                System.out.println("Player 2 wins!");
                break;
            } else if (pDeck2.size() == 10) {
                System.out.println("Player 1 wins!");
                break;
            } else {
                System.out.println("Current stats: [p1] " + pDeck1.size() + ", [p2] " + pDeck2.size());
                System.out.println();
            }
        }
    }
}
