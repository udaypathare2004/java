public class PalindromicPatternWithNumbers {
    public static void palindromicpatternwithnumbers(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers=Asending order
            for(int j=i;j>=1;j--){
              System.out.print(j);
            }
            //number=Decending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        palindromicpatternwithnumbers(5);
    }
}
