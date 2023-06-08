package io.github.mnizarzr.labdatastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSTraversal {

    private final LinkedList<Integer>[] adj;
    private final boolean[] visited;

    public DFSTraversal(int v) {
        this.adj = new LinkedList[v];
        this.visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void insertEdge(int src, int dest) {
        adj[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int n : adj[vertex]) {
            if (!visited[n]) {
                DFS(n);
            }
        }
    }

}
