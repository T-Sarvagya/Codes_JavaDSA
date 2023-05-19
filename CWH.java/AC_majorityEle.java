public class AC_majorityEle {
    public static int majorityEle(int nums[], int si, int ei){
        //Base case --> only one element in array
        if(si==ei){
            return nums[si];
        }
        int mid = si + (ei-si)/2;
        int left = majorityEle(nums, si, mid);
        int right = majorityEle(nums, mid+1, ei);
         //if two half agree on majority element return it
        if(right==left){
            return right;
        }
         //otherwise count each element and return the winner
        int Lcount = countInRange(nums , left , si , ei);
        int Rcount = countInRange(nums, right, si,ei);

        return Lcount>Rcount? left: right;
    }
    public static int countInRange(int nums[], int num, int si, int ei){
        int count = 0;
        for(int i=si;i<=ei;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int nums[] = {1,1,2,3,1,2,1,2,2,1,2};
        int ans = majorityEle(nums, 0, nums.length-1);
        System.out.println("Majority ele is:"+ans);
    }
}
