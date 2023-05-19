import java.util.*;
public class AC_LinkedHashMap{
    public static void main(String[] args){
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Nepal" , 200);

        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Nepal" , 200);

        System.out.println(tm);
    }
}