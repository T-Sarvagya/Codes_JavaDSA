public class AC_mergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[] , int si, int ei){
        int mid = si+(ei-si)/2;
        if(si >=ei){
            return;
        }
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid+1, ei);//right
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//iterator for left part
        int j = mid+1;//iterator for right part
        int k=0;//iterator for temp array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;//k++;
            }else{
                temp[k] = arr[j];
                j++;//k++;
            }
            k++;
        }
        //left part mai kuch bacha h 
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        //copy temp to original arr
        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8};
        printArr(arr);
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}