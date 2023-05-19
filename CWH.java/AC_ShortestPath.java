public class AC_ShortestPath {
    public static double getShortestPath(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //South
            if(dir=='S'){
                y--;
            } 
            //North
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir=='W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x; // x^2 = (x2-x1)^2 ....x1=0..therefore it is X2=x*x
        int Y2 = y*y;
        return Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}
