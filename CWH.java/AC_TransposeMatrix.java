public class AC_TransposeMatrix {
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},{5,6,7}};
        int row = matrix.length;
        int column = matrix[0].length;
        System.out.println("Current matrix:");
        printMatrix(matrix);

        //Transpose
        int[][] transpose = new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("After transpose of matrix:");
        printMatrix(transpose);
    }
}
