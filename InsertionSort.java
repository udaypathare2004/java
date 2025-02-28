public class InsertionSort {
    public static void insertionsort(int arr[]){
        for(int i =1;i< arr.length;i++){
            int key = arr[i];
          int  j=i-1;
            while (arr[i]>key && j>=0) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=arr[j];
            
        }
    }
    public static void main(String args []){
        int arr[] ={5,3,2,6,1};
        insertionsort(arr);
        
    }
}
