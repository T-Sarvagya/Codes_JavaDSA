import java.util.*;

public class AC_HashMap {
    public static void main(String[] args){
        //create
        HashMap<String , Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China" , 150);
        hm.put("US", 50);

        // System.out.println(hm);
        // //Get
        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("Indonesia"));
        // //Contains key
        // System.out.println(hm.containsKey("China"));
        // System.out.println(hm.containsKey("Indonesia"));
        // //Remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);
        // //size
        // System.out.println(hm.size());

        hm.put("Indonesia" , 125);
        hm.put("USA" , 60);
        hm.put("Nepal" , 170);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("Key = "+k +",Value = "+hm.get(k));
        }

        System.out.println(hm.entrySet());
    }
}
