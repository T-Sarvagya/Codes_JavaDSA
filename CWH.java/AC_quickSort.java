public class AC_quickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pvtIdx = partition(arr,si,ei);
        quickSort(arr, si, pvtIdx-1);
        quickSort(arr, pvtIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i= si-1; //to make place for elements smaller than pivot
        
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //swapping to make pivot come to its correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];//we cannot do pivot = arr[i] because we dont have to assign value to pivot variable
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args){
        int arr[] = {3,6,2,9,5,8};
        printArr(arr);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
