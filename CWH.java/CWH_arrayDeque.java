import java.util.ArrayDeque;

public class CWH_arrayDeque{
    public static void main(String[] args){
       ArrayDeque<Integer> ad1 = new ArrayDeque<>();
       
        ad1.add(6);
        ad1.add(43);
      //  ad1.addFirst(42);//Exception
        ad1.offerFirst(12);//adds to first
        //ad1.pollFirst();//Removes first element
       // ad1.removeFirst();//exception
        System.out.println(ad1.getLast());
        System.out.println(ad1.getFirst());//exception
        System.out.println(ad1.peekFirst());//gives 1st element
      
    }
}