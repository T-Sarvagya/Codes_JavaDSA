public class AC_GridWays {
    public static int totalGrid(int i, int j, int n, int m){
        // i is for current row and j is for current column
        if(i==n-1 && j==m-1){//target grid condition
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1 = totalGrid(i+1, j, n, m);
        int w2 = totalGrid(i, j+1, n, m);

        return w1+w2;
    }
    public static void main(String[] args){
        int n=3, m=3;
        System.out.println(totalGrid(0, 0, n, m));
    }
}
