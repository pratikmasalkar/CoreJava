public class e_inverted_halfpyramid_withnum {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
