public class CleareIthBit {
    public static int cleareithbit(int n ,int  i){
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public  static void main (String args []){
       System.out.println(cleareithbit(10, 1));
    }
}
