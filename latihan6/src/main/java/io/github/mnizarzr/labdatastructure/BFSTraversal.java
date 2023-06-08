package io.github.mnizarzr.labdatastructure;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    private final int node;
    private final LinkedList<Integer>[] adj;
    private final Queue<Integer> que;

    public BFSTraversal(int node) {
        this.node = node;
        this.adj = new LinkedList[node];
        for (int i = 0; i < node; i++) {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<>();
    }

    void insertEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int n) {
        boolean[] nodes = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
        while (que.size() != 0) {
            n = que.poll();
            System.out.print(n + " ");
            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!nodes[a]) {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

}
