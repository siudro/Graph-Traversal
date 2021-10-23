
package graphtraversal;

/**
 *
 * @author KHELLO
 */
import java.util.*;
import java.util.LinkedList;

public class DiGraph {

    int V; // Number of Vertices 
    LinkedList<Integer> adj[];
// adjacency lists

// Constructor 
    DiGraph(int V) {

        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0;
                i < adj.length;
                i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
// To add an edge to graph

    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v’s list.
    }

    void DFS(int n) {
        Vector<Boolean> visited = new Vector<Boolean>(V);
        for (int i = 0; i < V; i++) {
            visited.add(false);
        }
//DFS stack 
        Stack<Integer> S = new Stack<>();
        S.push(n);
        while (S.empty() == !true) {
            n = S.peek();
            S.pop();

            if (visited.get(n) == false) {
                System.out.print(n + " ");
                visited.set(n, true);
            }

            Iterator<Integer> itr = adj[n].iterator();
            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited.get(v)) {
                    S.push(v);
                }
            }
        }
    }

    void BFS(int s) {
        boolean v[] = new boolean[V];
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        v[s] = true;
        queue.add(s);
        while (queue.size() != 0) {

            s = queue.poll();
            System.out.print(s + " ");
           
            Iterator<Integer> i = adj[s].listIterator();
            adj[s].add(V);
            while (i.hasNext()) {
                int n = i.next();
                if (!v[n]) {
                    v[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void printGraph() {
        for (int src = 0; src < adj.length; src++) {
            System.out.print(src);
            for (Integer dest : adj[src]) {
                System.out.print(" -> " + dest);
            }
            System.out.println();
        }
    }
}
