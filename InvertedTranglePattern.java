import java.util.*;
public class InvertedTranglePattern {
    public static void main(String args[]){
       int n = 4 ;
        for(int i =1;i <=n;i++){
            for(int j=1;j<=n-i+1;j++){//logic is n-i+1
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
