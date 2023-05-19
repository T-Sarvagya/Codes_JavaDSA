public class AC_SearchSortedMatrix {
    public static boolean staircaseSearch1(int matrix[][],int key){ //TOP RIGHT
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){//cell value =matrix[row][col]
                col--; //left jana
            }
            else{
                row++; //bottom aana
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static boolean staricaseSearch2(int matrix[][],int key){// BOTTOM LEFT
        int row = matrix.length-1;
        int col = 0;
        while(row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                row --;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 33;
        staricaseSearch2(matrix, key);
    }
}
