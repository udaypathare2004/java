import java.util.*;
public class Calculater {
 public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b =sc.nextInt();
    char operater = sc.next().charAt(0);
    switch (operater) {
        case '+': System.out.println(a + b);
            break;
        case '-':System.out.println(a-b);
            break;
        case '*': System.out.println(a*b);
        break;
        case '/' : System.out.println(a/b);
        break;
        case '%' : System.out.println(a%b);
        break;   
        default: System.out.println("invalid input");
            break;
    }
  }
}
