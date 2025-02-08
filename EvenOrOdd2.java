import java.util.*;
public class EvenOrOdd2 {
   /*  Write a method named isEven that accepts an int argument. The method
    should return true if the argument is even, or false otherwise. Also write
    a program to test your method.*/
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
        
    }
public static void main(String args []){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==0){
        System.out.println("number is even"+ n);
    }else{
        System.out.println("number is odd"+ n);
    }
}





}
