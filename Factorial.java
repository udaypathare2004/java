import java.util.*;
public class Factorial {
/*
 * Write a program to find the factorial of any number entered by the use
*(Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * ...... * 1 and exists for positive numbers
*only. We write factorial as n!
*So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
*Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)
 */


    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int num; //to hold number
        int fact = 1;//to hold factorial
        
        System.out.println("Enter any positve enterger");
        num =sc.nextInt();

        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
