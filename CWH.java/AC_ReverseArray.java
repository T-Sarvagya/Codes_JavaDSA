public class AC_ReverseArray {
    public static void reverse(int arr[]){
        int first = 0, last = arr.length-1 ;
        while(first<last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,3};
        System.out.println("Original array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        reverse(arr);
        System.out.println("\nReversed array is:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
