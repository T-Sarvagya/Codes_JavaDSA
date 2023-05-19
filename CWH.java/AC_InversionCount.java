public class AC_InversionCount {
    public static int mergeSort(int arr[] , int si, int ei){
        int invCount = 0;
        if(ei>si){
            int mid = (si+ei)/2;
            invCount = mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid+1, ei);
            invCount += merge(arr,si ,mid+1, ei);
        }
        return invCount;
    }
    public static int merge(int arr[], int si, int mid, int ei){
        int i= si; //iterator for left part
        int j=mid; //iterator for right part
        int k=0; //iterator for temp
        int temp[] = new int[ei-si+1];
        int invCount =0;

        while(i<mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }else{
                temp[k] = arr[j];
                invCount += (mid-i);
            }
        }
        while(i<mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(i=si,k=0;i<=ei;i++,k++){
            arr[i] = temp[k];
        }
        return invCount;
    }
    public static void main(String[] args) {
        int arr[] = {1,20,6,4,5};
        System.out.println("Inversion counts are:");
        System.out.println(mergeSort(arr, 0, arr.length-1));
    //     for(int i=0;i<=arr.length-1;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    }
}
