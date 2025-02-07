import java.util.*;
public class Weekdays {
    /*
     * write  a java program to input week numbers (1-7) and print day of week name
     * using swich case 
     */
    public static void main(String args []){
     Scanner sc =new Scanner(System.in);
      int weekdays=sc.nextInt();
        switch (weekdays) {
        case 1:System.out.println("monday");
            
            break;
         case 2: System.out.println("Tuesday");
           break;

           case 3: System.out.println("Wednesday");
           break;
           case 4: System.out.println("thrusday");
           break;

           case 5: System.out.println("Friday");
           break;

           case 6: System.out.println("Satarday");
           break;
           
           case 7: System.out.println("Sunday");
           break;
    
        default:System.out.println("invalid ");
            break;
    }
    }
}
