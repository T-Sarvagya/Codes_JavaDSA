import java.util.*;

public class AC_WeakestSoilder {
    static class Row implements Comparable<Row>{
        int soilder;
        int idx;

        public Row(int soilder, int idx){
            this.soilder = soilder;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soilder == r2.soilder){
                return this.idx - r2.idx;
            }else{
                return this.soilder - r2.soilder;
            }
        }
    }
    public static void main(String[] args){
        int[][] army = {{1,0,0,0}, {1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0; i<army.length;i++){
            int count =0;
            for(int j=0; j<army[0].length;j++){
                count += army[i][j] == 1? 1:0;
            }
            pq.add(new Row(count, i));
        }

        for(int i=0; i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
