import java.util.*;
public class Palindrome {
    /*
      Write a Java program to check if a number is a palindrome in Java? ( 121 is a
       palindrome, 321 is not)
       A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
       palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
      palindrome because the reverse of 321 is 123, which is not equal to 321.
     */
    public static boolean palindrome(int n){
     int Palindrome= n;
     int reverse = 0;
     while (Palindrome !=0) {
        int remainder =Palindrome % 10;
        reverse = reverse * 10 + remainder;
        Palindrome =Palindrome / 10;
        }
        if(n ==reverse){
            return true;
        }
        return false;
     }

    
    public static void main(String args []){
      Scanner sc =new Scanner(System.in);
      int Palindrome = sc.nextInt();
       
      if(palindrome(Palindrome)){
        System.out.println(Palindrome + "is palindrome");
      }else{
        System.out.println(Palindrome+ "not a palindrome");
      }
    }
}
