

import java.lang.*;
import java.util.Arrays;

public class ReverseStringRecurDemo {
     static String s;
    public static void main(String[] args) {
        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);

        int arr[] = {50,20,10,30,30,40,50};
        Arrays.sort(arr);
        int[] new_arr = arr;
        int value = 7/5;
        System.out.print(new_arr[0]);
        System.out.print("s"+value);
    }
    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        //System.out.println("str.charAt(0)--"+str.charAt(0)+" --str.substring(1) "+str.substring(1));
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
