import java.util.*;

class insertionSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                //keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArr(arr);
    }
}
