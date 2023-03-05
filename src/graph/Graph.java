package graph;

public class Graph {
    private int[][] arr;
    private int v;
    private int e;

    public Graph(int vertices) {
        arr = new int[vertices][vertices];
        v=vertices;
        e=vertices;
    }

    public void addEdge(int u, int v) {
        arr[u][v] = 1;
        arr[v][u] = 1;
    }

    public void print() {
        for(int i=0;i<v;i++) {
            for(int j=0;j<e;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.print();
    }
}
