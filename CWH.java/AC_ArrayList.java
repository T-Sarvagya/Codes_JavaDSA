import java.util.ArrayList;
import java.util.Collections;

public class AC_ArrayList {
    public static void main(String[] args){
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(80);//O(1)
        // list.add(20);
        // list.add(70);
        // list.add(40);
        // list.add(50);
        // list.add(0,70); //O(n)
        // System.out.println(list);
        // int ele = list.get(2);//O(1)
        // System.out.println(ele);
        // list.remove(1);//O(n)
        // System.out.println(list);
        // list.set(1, 50);//O(n)
        // System.out.println(list);
        // System.out.println(list.contains(30));//O(n)
        // System.out.println(list.contains(50));
        // System.out.println(list.contains(10));
        // System.out.println(list.size());

        // //Reverse of array list -O(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();
        // //Sorting
        // Collections.sort(list);
        // System.out.println(list);

        //MULTI DIMENSIONAL ArrayList
        // ArrayList<ArrayList<?>> mainList = new ArrayList<>();
        // ArrayList<Integer> arr = new ArrayList<>();
        // mainList.add(arr);
        // System.out.println(mainList);
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // ArrayList<String> str = new ArrayList<>();
        // str.add("abc");
        // str.add("def");
        // str.add("ghi");
        // mainList.add(str);
        // System.out.println(mainList);

        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(10); list1.add(20);
        list2.add(30); list2.add(40);
        mainList2.add(list1);
        mainList2.add(list2);

        for(int i=0;i<mainList2.size();i++){
            ArrayList<Integer> currList = mainList2.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
