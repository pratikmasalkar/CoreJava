import java.util.*;

public class b_ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Pratik");

        System.out.println("Al : "+al);

        ArrayList al2 = new ArrayList();
        al2.add("al2");
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");

        al2.size();

        System.out.println("AL2 : "+al2);

        al.addAll(al2);
        System.out.println("Al : "+al);

    }
}
