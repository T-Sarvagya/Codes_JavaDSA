import java.util.*;

public class AC_NxtGreaterStack {
    public static void main(String[] args){
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        //next greater right ke lie 
        //agr next greater left ke lie aaega to bas ye bahar wala for loop change hoga
        //ye 0 se arr.length tkk jaega baaki sab same hoga
        for(int i=arr.length-1; i>=0;i--){
            //while

            //next smaller right -- ye aa jae to bas <= isko >= ye krna h neeche
            //aur next smaller left aae to-- neeche bhi ye change aur upar loop bhi 0 to n
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            //push in stack s
            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
    }
}
