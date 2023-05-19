public class AC_KadanesSubarraySum {
    //FIRST
    public static void kadanesSubarr(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i]; 
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum sum is:"+ maxSum);
    }
    //SECOND
    //Same but will work for all negative values in array. The first one will print 0 if all values are -ve
    static int maxSubArraySum(int arr[])
	{
	
		int max = Integer.MIN_VALUE, currSum= 0;
											

		for (int i = 0; i < arr.length; i++) {
			currSum = currSum + arr[i];
			if (max < currSum)
				max = currSum;
			if (currSum < 0)
				currSum = 0;
		}
		return max;
	}


    public static void main(String[] args) {
        //FIRST
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanesSubarr(arr);

        //SECOND
        int[] a = { -11,-2,-3,-4 };
		System.out.println("Maximum contiguous sum is "+ maxSubArraySum(a));
	}
    
}
