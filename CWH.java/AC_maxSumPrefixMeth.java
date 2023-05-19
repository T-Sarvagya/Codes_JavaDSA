import java.rmi.MarshalException;

public class AC_maxSumPrefixMeth {
    public static void prefixSumMethod(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                currSum = start==0?prefix[end]:prefix[end]-prefix[start-1];
            }
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("The maximum sum is :"+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-1,5,4,7};
        prefixSumMethod(arr);
    }
}
