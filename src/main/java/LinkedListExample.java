import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){
        // Create a Linked List
        LinkedList<String> students = new LinkedList<String>();

        // Add students to Linked List
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Namrata");
        students.addLast("Hailey");
        students.add(2,"Tara");

        String firstStudent  =  students.getFirst();
        System.out.println("First "+firstStudent);
        String lastStudent  =  students.getLast();
        System.out.println("Last "+lastStudent);
        System.out.println(students.size());
        System.out.println(students);

        // Get value by index
        String secondStudent  =  students.get(1);
        System.out.println("Second "+secondStudent);

        // To get the index of a string
        int i = students.indexOf("Morgan");
        System.out.println("Index of Morgan "+i);

        // To remove elements we can use below methods
        students.removeFirst();
        students.removeLast();
        students.remove("Taylor");
        students.remove(1);
        System.out.println(students);

        boolean hasTaylor = students.contains("taylor");
        System.out.println(hasTaylor);

        // To clear the list we cna use below method
        students.clear();
        System.out.println(students);

    }
}
