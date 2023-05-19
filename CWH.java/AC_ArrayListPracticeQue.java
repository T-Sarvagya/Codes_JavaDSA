import java.util.*;

public class AC_ArrayListPracticeQue {
    public static boolean isMonotonic(ArrayList<Integer> nums){
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                inc = false;
            }
            if(nums.get(i)<nums.get(i+1)){
                dec = false;
            }
        }

        return inc || dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(7);
        nums.add(10);
        nums.add(9);
        if(isMonotonic(nums)){
            System.out.println("List is monotonic");
        }else{
            System.out.println("List is not monotonic");
        }
    }
}
