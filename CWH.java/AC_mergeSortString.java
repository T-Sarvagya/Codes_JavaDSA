public class AC_mergeSortString {
    public static String[] mergeSort(String[] arr, int lo, int hi){
        int mid = lo+(hi-lo)/2;
        if(lo==hi){
            String[] A = {arr[lo]};
            return A;
        }
        String[] arr1 = mergeSort(arr, lo, mid);
        String[] arr2 = mergeSort(arr, mid +1, hi);
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }
    static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m+n];

        int idx = 0; //for arr3
        int i=0; //for arr1
        int j=0; //for arr2

        while(i<m && j<n){
            if(isAlphabeticallySmaller(arr1[i] , arr2[j])){
                arr3[idx] = arr1[i];
                i++;idx++;
            }else{
                arr3[idx] = arr2[j];
                j++;idx++;
            }
        }
        while(i<m){
            arr3[idx++] = arr1[i++];
        }
        while(j<n){
            arr3[idx++] = arr2[j++];
        }
        return arr3;
    }
    static boolean isAlphabeticallySmaller(String str1 , String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"sun","earth","mars","mercury"};
        String a[] = mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
