import java.util.HashMap;
import java.util.Map;

public class f_MapDemo {
    public static void main(String[] args) {
        Map mp = new HashMap();
        mp.put(101, "Sharad");
        mp.put(102, "Pratik");
        mp.put(101, "prateek");

        mp.size();
        System.out.println(mp.hashCode());;

        System.out.println(mp);
    }
}
