import java.util.Stack;

public class e_StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(12);
        st.push("Pratik");
        st.push(true);
        int capacity = st.capacity();
        System.out.println(capacity);
        System.out.println(st);

    }
}
