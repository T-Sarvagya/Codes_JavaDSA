public class AC_QueensBT {
    public static void nQueens(char[][] board, int row){ // for 1 solution boolean
        if(row==board.length){
            printBoard(board); //comment out to print only 1 soln
            count ++;
            return;
           // return true;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                //For 1 solution//
                // if(nQueens(board, row+1)){
                //     return true;
                // }
                nQueens(board, row+1);//function call
                board[row][j] = 'x'; //Backtracking step
            }
            
        }
        //return false; //For 1 soln
    }
    public static boolean isSafe(char[][] board, int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char[][] board){
        System.out.println("----------Chess Board----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count =0; //To count no of possible ways
    public static void main(String[] args) {
        int n=4;
        char[][] board = new char[n][n];
        //initializing board blocks with x
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0); //Comment out this to execute 1 solution code
        //For Printing 1 solution only

        // if(nQueens(board, 0)){
        //     System.out.println("Solution is possible");
        //     printBoard(board);
        // }else{
        //     System.out.println("Solution is not possible");
        // }

        System.out.println("Total number of ways are:"+count);
    }
}
