package sarvagyacode;

class CWH_MinMaxArray {
    public static void main(String[] args) {
        int[] a = {23,4,72,15,62};
        int min = a[0];
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Minimum value of array is:"+ min);
        System.out.println("Maximum value of array is:"+ max);
    }
}
