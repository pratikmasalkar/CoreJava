import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(105, "Akash");
        tm.put(104, "Radha");
        tm.put(102, "Shubham");
        tm.put(103, "Shubhangi");
        tm.put(101, "Pratik");
        System.out.println(tm);
        System.out.println(tm.headMap(101));
        System.out.println(tm.values());
        System.out.println(tm.firstEntry());

        System.out.println(tm.ceilingKey(104));
    }
}
