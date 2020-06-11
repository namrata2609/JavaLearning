import java.util.HashMap;

public class HashMapExample {
    public static  void main (String args[]) {
        HashMap<String, Integer> wordToNum = new HashMap();
        wordToNum.put("One", 1);
        wordToNum.put("Two", 2);
        wordToNum.put("Three", 3);
        wordToNum.put("Four", 4);
        wordToNum.put("Five", 5);
        System.out.println(wordToNum.get("Three"));
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());
        System.out.println(wordToNum.remove("Three"));


        // Common use of which number is the most repeated one

        String s = "phonebook";
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length();i++) {
          Character currentChar = s.charAt(i);
          if(hashMap.containsKey(currentChar)){
             hashMap.put(currentChar,hashMap.get(currentChar)+1);
          }else{
              hashMap.put(currentChar,1);
          }
        }

        Character mostRepeated = ' ';
        int max = 0;
        for(Character key :hashMap.keySet()){
            int currentValue  = hashMap.get(key);
            if(currentValue>max){
                mostRepeated = key;
                max = currentValue;
            }
        }

        System.out.print("Most repeated: "+mostRepeated+" | Times: "+max);
    }
}
