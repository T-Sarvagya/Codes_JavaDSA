import java.util.*;

public class AC_ActivitySelection {
    public static void main(String[] args){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        // //If our end array wasn't sorted then -- we have to sort like this
        // //Sorting
        // int[][] activities = new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0] = i; //index
        //     activities[i][1] = start[i]; //start
        //     activities[i][2] = end[i]; //end
        // }

        // Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activityy -- Always select it
        maxAct = 1;
        ans.add(0); //activities[0][0] //sorting wale ke lie
        int lastEnd = end[0]; // activities[0][2] //sorting wale case ke lie
        for(int i=0;i<end.length;i++){
            if(start[i] >= lastEnd){ //start[i] -> activities[i][1]
                //select activity
                maxAct++;
                ans.add(i); //ans.add(activities[i][0])
                lastEnd = end[i]; //end[i] -> activities[i][2]
            }
        }

        System.out.println("Maximum number of activities are: "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
