import java.util.*;

public class AC_StackJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(6);
        s.push(8);
        s.push(9);
        s.push(2);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
