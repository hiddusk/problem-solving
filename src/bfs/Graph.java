package bfs;



import java.util.Queue;

public class Graph {
    private java.util.LinkedList[] arr;
    private int vertices;

    public Graph(int vertices) {
        this.vertices = vertices;
        arr = new java.util.LinkedList[vertices];
        for(int i=0;i<vertices;i++) {
            arr[i] = new java.util.LinkedList();
        }
    }

    public void addEdge(int u, int v) {
        arr[u].add(v);
        arr[v].add(u);
    }

    public void bfs(int s) {
        boolean[] vertices = new boolean[this.vertices];
        Queue queue = new java.util.LinkedList();
        vertices[s]=true;
        queue.offer(s);

        while(!queue.isEmpty()) {
            int result = (int)queue.poll();
            System.out.print(result + " ");
            for(int i=0;i<arr[result].size();i++) {
                int adj = (int)arr[result].get(i);
                if(!vertices[adj]) {
                    vertices[adj] = true;
                    queue.offer(adj);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(2,4);
        graph.bfs(0);
    }
}

