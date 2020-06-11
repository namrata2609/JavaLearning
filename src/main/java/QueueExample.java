import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String args[]){
        Queue<String> queue = new LinkedList();
        // Enqueue items
        queue.add("Charlie");
        queue.add("Sally");
        queue.add("Morgan");
        queue.add("Taylor");
        queue.add("Jamie");

        System.out.println(queue);

        String nextElement = queue.peek();
        System.out.println("Whats next !!! "+nextElement);

     // Queue remove item from front and insert in the last
        String removedItem = queue.remove();
        System.out.println("Removed item!!! "+removedItem);
        System.out.println(queue);
    }
}
