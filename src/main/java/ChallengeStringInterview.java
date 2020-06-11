public class ChallengeStringInterview {

    public static void findNumberOfVowelsAndConsonant(String input){
        int noOfVowels = 0;
        int noOfConsonant = 0;
        String vowels = "aeiou";
        String normalize = (input.toLowerCase().trim());
        char[] inputArray = normalize.toCharArray();
        for(char c: inputArray){
            if(vowels.indexOf(c)!=-1){
                noOfVowels ++;
            }else if(c!=' '){
                noOfConsonant ++;
            }
        }
        System.out.println("There are "+noOfVowels +" vowels and "+noOfConsonant + " no of consonants");

    }

    public static void  findNumberOfVowelsAndConsonantUsingAscii(String input){
        int noOfVowels = 0;
        int noOfConsonant = 0;
        String vowels = "aeiouAEIOU";
         for(int i = 0; i< input.length();i++){
             int asciiValue = (int) input.charAt(i);
             if((asciiValue <= 90 && asciiValue >= 65) || (asciiValue <= 122 && asciiValue >= 97)){
                if(vowels.contains(Character.toString(input.charAt(i)))){
                    noOfVowels ++;
                }else{
                    noOfConsonant ++;
                }
             }
         }
        System.out.println("There are "+noOfVowels +" vowels and "+noOfConsonant + " no of consonants");
    }

    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = " there is a quite mouse";
        String s3 = "I am happy ";

        System.out.println("Algo1=======================");
        findNumberOfVowelsAndConsonant(s1);
        findNumberOfVowelsAndConsonant(s2);
        findNumberOfVowelsAndConsonant(s3);


        System.out.println("Algo2=======================");
        findNumberOfVowelsAndConsonantUsingAscii(s1);
        findNumberOfVowelsAndConsonantUsingAscii(s2);
        findNumberOfVowelsAndConsonantUsingAscii(s3);


    }
}
