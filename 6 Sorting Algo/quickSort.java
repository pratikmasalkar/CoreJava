public class quickSort {
    int partition(int arr[], int low, int high) {
        int pivot = arr[(high + low) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (pivot < arr[high]) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void quick_Sort(int arr[], int low, int high) {
        int prt = partition(arr, low, high);
        if (low < prt - 1) {
            quick_Sort(arr, low, prt - 1);
        }
        if (prt < high) {
            quick_Sort(arr, prt, high);
        }
    }

    void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 2, 4, 34, 25, 72, 44, 32, 46 };
        int len = arr.length - 1;
        quickSort obj = new quickSort();
        obj.quick_Sort(arr, 0, len - 1);
        obj.printArr(arr);

    }
}
