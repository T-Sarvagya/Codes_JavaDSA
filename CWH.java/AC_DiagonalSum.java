public class AC_DiagonalSum {
    public static int diagonalSum1(int matrix[][]){
        //this is bad becoz time complexity is O(n^2)
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                //primary diagonal
                if(i==j){
                    sum += matrix[i][j];
                }else if(i+j == matrix.length-1){//Secondary diagonal
                    sum +=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int diagonalSum2(int matrix[][]){
        //this is optimised code O(n)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum += matrix[i][i];
            //sd
          //  sum += matrix[i][matrix.length-i-1];//ye even wale ke lie thik h pr odd m 2 bar beech wala ele add ho jaega
          if(i != matrix.length-i-1){//isme odd wala case bhi aa gaya
            sum+=matrix[i][matrix.length-i-1];
          }

        }
        return sum;
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int d = diagonalSum2(matrix);
        System.out.println(d);
        
    }
}
