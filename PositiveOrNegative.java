import java.util.*;
public class PositiveOrNegative {
    /*
     * write a java program to get a number from the user and print whether it is positive or negative
     */
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       String type =((number>=0)?"positive":"negative");
       System.out.println(type);
    }

}
