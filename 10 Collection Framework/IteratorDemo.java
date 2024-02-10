import java.util.ArrayList;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("Pratik");
        l.add(null);
        

        System.out.println("----------iterator---------");
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        
        System.out.println("----------List iterator---------");
        ListIterator li = l.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println(" -------------With hasPrevious method ---------------");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
