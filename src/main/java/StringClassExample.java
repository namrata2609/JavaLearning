public class StringClassExample {


    public static void main(String args[]){
        String firstName = "Namrata";
        String lastName = "Srivastava";
        String name = firstName+" "+lastName;
        String name1 = firstName.concat(" ").concat(lastName);
        System.out.println(name);
        System.out.println(name1);
        
        /* We can also use String builder which is very fast and helpful when we want to append the value*/
        
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("dfghj");
        stringBuilder.append("bnm");
        stringBuilder.insert(9,"ALPHA");
        stringBuilder.delete(1,3);
        System.out.println(stringBuilder.toString());

    }


}
