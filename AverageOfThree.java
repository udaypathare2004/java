import java.util.*;
public class AverageOfThree {
  //Write a Java method to compute the average of three numbers..
  public static double averageofthree(double a,double b,double c){
    
    return (a + b + c )/3;
  }
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    double a =sc.nextDouble();
    double b =sc.nextDouble();
    double c =sc.nextDouble();
    System.out.println(averageofthree(a,b,c));
  }
}
