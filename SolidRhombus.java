public class SolidRhombus{
    public static void solidrhombus(int n){
        /*
         * logic= n is the input
         *       first i just print spaces=n-i
         *   then i print the stars=j<=n
         *       here i want to print the stars 
         *       the user  is giving just like here 5stars
         */
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args []){
            solidrhombus(5);
    }

}