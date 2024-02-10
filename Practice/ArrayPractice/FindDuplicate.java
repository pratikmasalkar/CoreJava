import java.util.*;

class FindDuplicate {
    public static void findDuplicates(int arr[]) {
        Set hs = new HashSet();
        for (int num : arr) {
            if(hs.add(num)==false){
                System.out.print(num+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 5, 3 };
        findDuplicates(arr);
    }
}