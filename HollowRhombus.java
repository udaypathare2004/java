public class HollowRhombus {
   public static void hollowrhombus(int n){
    for(int i=1;i<=n;i++){
        //spaces n-i= 5-1=4 it means 4 spaces will print
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
        }
        //hollow rectangls -stars
        for(int j=1;j<=n;j++){
            if (i==1  || i==n || j==1 || j==n) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   } 
   public static void main(String args []){
    hollowrhombus(5);
   }
}
