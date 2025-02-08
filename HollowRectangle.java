public class HollowRectangle {
   
    public static void hollow_rectangle(int Rows,int colms){
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=colms;j++){
                if( i==1 ||  i ==Rows ||  j == 1 || j == colms){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        hollow_rectangle(4, 5);
    }
}
