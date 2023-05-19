import java.util.*;

public class AC_Deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(4);
        dq.addFirst(2);
        dq.addLast(7);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
