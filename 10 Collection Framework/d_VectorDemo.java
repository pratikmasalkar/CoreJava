import java.util.Vector;

public class d_VectorDemo {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add("Pratik");
        vc.add(11);
        vc.add(true);
        
        int size = vc.size();
        int capacity = vc.capacity();
        System.out.println("Capacity : "+capacity);
        System.out.println("Size : "+size);
        System.out.println(vc);
    }
}
