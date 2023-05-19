public class AC_AssignmArray1 {
    public static boolean containsDuplicate(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {11,2,3,1,2,31};
        System.out.println(containsDuplicate(nums));
    }
}
