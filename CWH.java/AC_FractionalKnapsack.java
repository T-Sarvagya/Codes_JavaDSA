import java.util.*;
public class AC_FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50; 

        double[][] ratio = new double[val.length][2];
        //0th col = index & 1st col = ratio
        for(int i=0; i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;
        //Backward loop to get ratio in descending order
        for(int i=ratio.length-1; i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                //add full
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //add fractional
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Max total val is: "+ finalVal);
    }
}
