public class AC_BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){//FOUND
                return mid;
            }
            if(arr[mid]<key){//RIGHT
                start = mid+1;
            }else{//LEFT
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,10,32,46,97};
        int key = 2;

        int ans = binarySearch(arr, key);
        if(ans == -1){
            System.out.println("Key is not there in array.\nINVALID KEY!!");
        }else{
            System.out.println("Key ("+ key+") found at index:"+ans);
        }
    }
}
