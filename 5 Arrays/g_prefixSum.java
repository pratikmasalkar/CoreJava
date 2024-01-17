public class g_prefixSum {
    public static void prefixSum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    sum = sum + arr[k];
                }
                System.out.print(sum + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 7 };
        prefixSum(arr);
    }
}
