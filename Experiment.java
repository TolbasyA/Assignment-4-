public class Experiment {

    public void runTraversals(Graph g) {
        long bfsStart = System.nanoTime();
        g.bfs(0);
        long bfsEnd = System.nanoTime();

        long dfsStart = System.nanoTime();
        g.dfs(0);
        long dfsEnd = System.nanoTime();

        System.out.println("BFS time: " + (bfsEnd - bfsStart) + " ns");
        System.out.println("DFS time: " + (dfsEnd - dfsStart) + " ns");
    }

    public void runMultipleTests() {
        testGraph(10);
        testGraph(30);
        testGraph(100);
    }

    private void testGraph(int size) {
        Graph graph = new Graph();

        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {
            graph.addEdge(i, i + 1);
        }

        for (int i = 0; i < size - 2; i += 2) {
            graph.addEdge(i, i + 2);
        }

        System.out.println("\nGraph size: " + size + " vertices");

        if (size == 10) {
            System.out.println("Graph structure:");
            graph.printGraph();
        }

        runTraversals(graph);
    }

    public void printResults() {
        System.out.println("Experiment completed.");
    }
}