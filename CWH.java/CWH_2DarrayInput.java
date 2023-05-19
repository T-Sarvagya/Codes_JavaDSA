package sarvagyacode;
import java.util.Scanner;

class CWH_2DarrayInput  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of array");                          
        int r = sc.nextInt();
        System.out.println("Enter column of array");   
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter elements of array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }

        }

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
