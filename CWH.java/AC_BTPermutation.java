public class AC_BTPermutation {
    public static void permutations(String str , String ans){
        //Base case
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //delete this character from original string
            //"abcde"-deleting c-> "ab"+"de" //using substring
            String Newstr = str.substring(0, i)+str.substring(i+1);//not mentioning end index means it will consider till last
            permutations(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }
}
