import java.util.Stack;

public class StackExample {

    public static void main(String args[]){
        Stack<String> deckOfCards = new Stack();
        String card1 = "Jack : Diamonds";
        String card2 = "8 : Hearts";
        String card3 = "3 : clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);
        System.out.println(deckOfCards);


        String top  = deckOfCards.peek();
        System.out.println(top);
        System.out.println(deckOfCards.size());

        // To remove item from stack
        while(!deckOfCards.isEmpty()){
            String removedCard = deckOfCards.pop();
            System.out.println("Removed card "+ removedCard);
        }
    }
}
