public class UpdateIthBit {
    public static int setIthbit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int cleareithbit(int n ,int  i){
        int bitmask = ~(1<<i);
        return n & bitmask;

    }
    public static int updateithbit(int n,int i,int newBit){
        if (newBit ==0) {
            return cleareithbit(n,i);
        }else{
            return setIthbit(n, i);
        }
    }
    public static void main(String args[]){
    System.out.println(updateithbit(10, 1, 0));
    } 
}
