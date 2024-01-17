public class c_reverseArray {
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 ,60};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
