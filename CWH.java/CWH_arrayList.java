import java.util.ArrayList;

public class CWH_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(11);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(0,5);
        l1.add(3);
        l1.addAll(l2);
        //l1.addAll(0,l2);
        //l1.clear();//clears all the elements of list
        l1.remove(11);
        l1.set(3,199);

       // System.out.println(l1.clone());
       System.out.println(l1.contains(44));
       System.out.println(l1.indexOf(3));
       System.out.println(l1.lastIndexOf(3));
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
    }
}
