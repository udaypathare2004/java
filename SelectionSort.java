public class SelectionSort {
    public static void selectionsort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j < arr.length;j++){
              if(arr[minPos]< arr[j]){
                 minPos = j;
              }
            }
            //swap
            int temp =arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void bubblesort(int arr[]) {
        // Outer loop for passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]) {
        // Print array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     
    public static void  main(String args[]){
        int arr[]={5,3,2,1,6};
        printarr(arr);
        selectionsort(arr);
        bubbleSort(arr);

    }
    private static void bubbleSort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bubbleSort'");
    }
}
