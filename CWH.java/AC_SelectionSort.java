public class AC_SelectionSort {
    public static void selectionSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int minPos = turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
                // if(arr[minPos]>arr[j]){
                //     minPos = j;
                // }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,9,2,5,1,9,6};
        selectionSort(arr);
        printArr(arr);
    }
}
