import java.util.*;

public class AC_HashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("India");
        hs.add("China");
        hs.add("Nepal");
        hs.add("India");
        // System.out.println(hs.size());

        // System.out.println(hs);
        // hs.remove("India");
        // System.out.println(hs);
        // //hs.clear() --> empty kr deta h hashset ko

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
