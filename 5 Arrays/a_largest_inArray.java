public class a_largest_inArray {
    public static int findLargest(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 5, 70, 34, 100, 89, 223 };
        int large = findLargest(arr);
        System.out.println("Largest element is :" + large);
    }
}