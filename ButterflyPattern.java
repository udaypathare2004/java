public class ButterflyPattern {
 public static void butterflypattern(int n){
    /*logic first i want to print stars then i want to print "spaces"
     * then again i want to print stars
     * then i jast want to flip the main loop
     * main logic= for(int j =1;j<=i;j++),for(int j=1;j<=2*(n-i);j++),
     *             for(int j =1;j<=i;j++)
    */
    for(int i =1;i<=n;i++){
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i =n;i>=1;i--){
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

 }   
 public static void main(String arg []){
    butterflypattern(5);
 }
}
