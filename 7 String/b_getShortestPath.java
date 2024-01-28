public class b_getShortestPath {
    public static float calcPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            //South
            if(path.charAt(i)=='S'){
                y--;
            }else if(path.charAt(i)=='N'){
                y++;
            
            }else if(path.charAt(i)=='E'){
                x++;
            }else{
                x--;
            }
            
        }

        return 3.0f;

    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(calcPath(path));
    }
}
