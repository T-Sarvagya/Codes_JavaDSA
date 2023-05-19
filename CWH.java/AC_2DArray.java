import java.util.Scanner;

public class AC_2DArray {
    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]== key){
                    System.out.println("Key found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int [4][3];
        int n = matrix.length; //No. of rows
        int m = matrix[0].length; //No.of columns
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 5);
    }
}
