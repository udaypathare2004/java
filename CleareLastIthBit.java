public class CleareLastIthBit {
    public static int claearlastithbit(int n, int i){
      int bitmask =(~0)<<i;
      return n & bitmask;
    }
    public static void main(String args[]){
     System.out.println(claearlastithbit(15, 2));
    }
}
