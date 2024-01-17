public class b_binarySearch {
    public static int findKey(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 34, 70, 74, 100, 189, 223 };
        int key = 223;
        int found = findKey(arr, key);
        if (found == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Largest element is :" + found);
        }
    }
}
