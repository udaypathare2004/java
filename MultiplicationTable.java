import java.util.*;
public class MultiplicationTable {
    public static void printMultiplicationTable(int number){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int table ;
        for(int i=1;i<=10;i++){
         table = n *i;
         System.out.println(table);
        }
    } 
    public static void main(String args []){
        //Write a program to print the multiplication table
        //of a number n , enterd by the user
       printMultiplicationTable(6);
    }
}
