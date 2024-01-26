public class insertionSort {
    public static void insertion_Sort(int arr[]){
        int temp, j;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i;
            while (j>0 && arr[j-1]>temp) {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={12,2,34,89,54,6};
        insertion_Sort(arr);
        printArr(arr);
    }
}
