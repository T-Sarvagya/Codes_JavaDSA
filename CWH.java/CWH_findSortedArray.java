package sarvagyacode;

class CWH_findSortedArray {
    public static void main(String[] args) {
        int[] a = {1,21,32,43,5};
       boolean b = true;
       for(int i=0;i<a.length-1;i++){
         if(a[i]>a[i+1]){
            b = false;
         } 
       }
       if(b){
        System.out.println("Array is sorted");
       }
       else{
        System.out.println("Array is not sorted");
       }
    }
}
