public class AC_backtrackSubsets {
    public static void printSubsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //Yes choice
        printSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        printSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
    }
}
