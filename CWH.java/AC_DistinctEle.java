import java.util.*;

public class AC_DistinctEle {
    public static void main(String[] args) {
        int[] nums = {4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> sets = new HashSet<>();
    for(int i=0; i<nums.length;i++){
        sets.add(nums[i]);
    }
    System.out.println("No. of distinct elements are:"+ sets.size());
    }
}
