/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtraversal;

/**
 *
 * @author KHELLO
 */
public class GraphTraversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiGraph g = new DiGraph(10);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(4, 7);
        g.addEdge(6, 7);
        g.addEdge(6, 8);
        g.addEdge(8, 9);
        g.addEdge(9, 9);
        g.printGraph();
        System.out.println("Depth First Search visit order: ");
        g.DFS(0);
        System.out.println();
        System.out.println("Breadth First Search visit order: ");
//        g.BFS(0);
        double[] x = new double[4];

        x[0] = 8.5;

        x[1] = 6.5;

        x[2] = 9.5;

        x[3] = 12.5;

        System.out.println(x[1 + 2]);
    }

}
