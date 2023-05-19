import java.util.Scanner;
// Time complexity = O(nlogn)
class mergeSort{
    public static void divide(int arr[] , int si, int ei){

        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid +1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++] = arr[idx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //int arr[] = {2,6,4,1,7};
        divide(arr, 0, 4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
