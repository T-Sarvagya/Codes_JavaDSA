package sarvagyacode;
import java.util.Scanner;

class CWH_SwapArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        int l = arr.length;
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Swapping:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        int m = Math.floorDiv(l, 2);  // l=5 --> 5/2 => 2.5 but m will store only 2
        int temp;

        for(int i=0;i<m;i++){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-i-1] = temp;
        }
        System.out.println("\nAfter Swapping:");
        for(int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
