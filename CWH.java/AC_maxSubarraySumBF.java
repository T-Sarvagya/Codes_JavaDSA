public class AC_maxSubarraySumBF{
    public static void subarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int start=0;start<numbers.length;start++){
            for(int end=start;end<numbers.length;end++){
                currSum = 0;
                for(int k=start;k<=end;k++){
                    //subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sum of subarray is:"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarraySum(numbers);
    }
}