import java.util.Scanner;

public class Solution {

   
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String arr[] = new String[(s.length()-k)];
        for (int i = 0; i < s.length() -k +1; i++) {
            String subs = s.substring(i, i + k);
            arr[i] = subs;
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i].compareTo(arr[j])>0) {
                    String temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        smallest = arr[0];
        largest = arr[arr.length - 2];


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}