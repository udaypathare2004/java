import java.util.Scanner;
  public class leapyearchecker{
   public static void main(String args []){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a year:");
    int year = sc.nextInt();
    if (isLeapYear(year)){
      System.out.println(year + "is aleap year");
    }else{
      System.out.println(year + "is not leap year");
    }
   }

  private static boolean isLeapYear(int year) {
    
    return (year%4 ==0 && year % 100 !=0) || (year % 400 == 0);
  }
  }
