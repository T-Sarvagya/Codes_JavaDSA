public class AC_DuplicatesInString {
    public static void removeDuplicate(String str, int idx, StringBuilder newString, boolean map[]){
        //base case
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicate(str, idx+1, newString, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newString.append(currChar), map);
        }

    }
    public static void main(String[] args){
        String str = "appnnacolleg";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26] );
    }
}
