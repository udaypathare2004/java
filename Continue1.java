import java.util.*;
public class Continue1 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter your number");
            int n =sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("Number was "+ n);

        }while(true);
    }
}
