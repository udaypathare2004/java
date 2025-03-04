import java.util.*;
public class VovelCounter {
    public static int countVowels(String str){
        int count =0;

        //Convert string to character array and iterate
        for(char ch : str.toCharArray()){
            if(ch =='a'|| ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main (String args[] ){
        Scanner sc =new Scanner(System.in);
        //Prompt user for input
        System.out.println("Enter a string:");
        String input =sc.nextLine();

        //Close scanner
        sc.close();

        //Call method to count vowels
        int vowelCount = countVowels(input);

        //Display result
        System.out.println("Number of lowercase vovels:" + vowelCount);
    }
}
