import java.util.*;
public class AC_BFSndDFSutil {
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void bfs(ArrayList<Edge> graph[]){
        boolean[] vis = new boolean[graph.length];
        for(int i=0; i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge> graph[], boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //source =0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){//visit current
                System.out.print(curr+" "); //print 
                vis[curr] = true;           //make visited true
                for(int i=0; i<graph[curr].size();i++){ //add neighbour in queue
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[]){
        boolean[] vis = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                dfsUtil(graph, i, vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        //visit
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
