package io.github.mnizarzr.labdatastructure;

public class Main {
    public static void main(String[] args) {
        BFS();
        System.out.println();
        DFS();
    }

    public static void BFS() {
        BFSTraversal graph = new BFSTraversal(6);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(3, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 0);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 1);
        graph.insertEdge(3, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 3);
        System.out.print("Breadth-First Traversal: ");
        graph.BFS(0);
    }

    public static void DFS() {
        DFSTraversal graph = new DFSTraversal(8);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);
        System.out.print("Depth-First Traversal: ");
        graph.DFS(0);
    }
}