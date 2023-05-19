public class AC_subarrays {
    public static void printSubarray(int numbers[]){
        int totalSubarray = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                totalSubarray++; 
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are:"+totalSubarray);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);
    }
}
