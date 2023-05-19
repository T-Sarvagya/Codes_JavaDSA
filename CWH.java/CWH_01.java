public class CWH_01{
	public static void count7(int arr[][]){
		int count = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==7){
					count++;
				}
			}
		}
		System.out.println("Number of 7's in array is:"+count);
	}
	public static void sum2ndRow(int arr[][]){
		int sum =0;
		//for(int i=2; i<=2;i++){
			for(int j=0;j<arr[0].length;j++){
				sum+= arr[1][j];
			}
		//}
		System.out.println("Sum of 2nd row is:"+sum);
	}
	public static void main(String[] args){
		int arr[][] = {{2,3,7},{2,3,7},{2,8,6}};
		count7(arr);
		sum2ndRow(arr);

	}
}