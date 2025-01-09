package datastructures.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.printGraph();

        System.out.println("After adding an edge between A, B, C, and D!");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.printGraph();

        System.out.println("After removing an edge between A and B!");
        graph.removeEdge("A", "B");
        graph.printGraph();

        System.out.println("After removing an vertex D!");
        graph.removeVertex("D");
        graph.printGraph();
    }
}
