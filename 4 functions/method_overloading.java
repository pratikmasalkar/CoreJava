public class method_overloading {
    // calculating sum of two numbers
    public static void calSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
    }

    // calculating sum of three numbers
    public static void calSum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three numbers is " + sum);
    }

    public static void main(String[] args) {
        calSum(12, 20);
        calSum(12, 20, 30);
    }
}