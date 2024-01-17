public class f_maxSumOfSubArr {
    public static void maxSumSubArr(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + arr[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is " + maxSum);
    }
    public static void main(String[] args) {
        // Time complexity is o(n2)
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSumSubArr(arr);
    }
}
