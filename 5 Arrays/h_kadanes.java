public class h_kadanes {
    public static void kadanes(int arr[]){
        int cs=0;
        int ms=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs; 
            }
        }
        System.out.println("Max Sum "+ms);
        System.out.println("Current Sum "+cs);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
