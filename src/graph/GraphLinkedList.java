package graph;

public class GraphLinkedList {
    private LinkedList[] arr;

    public GraphLinkedList(int vertices) {
        arr = new LinkedList[vertices];
        for(int i=0;i<vertices;i++) {
            arr[i] = new LinkedList();
        }
    }

    public void print() {
        for(int i=0;i< arr.length;i++) {
            System.out.print(i+"==>");
            arr[i].print();
            System.out.println();
        }

    }

    public void addEdge(int u, int v) {
        arr[u].add(v);
        arr[v].add(u);
    }

    public static void main(String[] args) {
        GraphLinkedList graph = new GraphLinkedList(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.print();
    }
}
