import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList {
    private Map<String, List<String>> adjList;

    public AdjacencyList() {
        adjList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String vertex1, String vertex2) {
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
    }

    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList();

        String[] vertices = {"A", "B", "C", "D", "E", "F", "G"};
        for (String vertex : vertices) {
            graph.addVertex(vertex);
        }

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        graph.addEdge("C", "E");
        graph.addEdge("D", "E");
        graph.addEdge("D", "F");
        graph.addEdge("D", "G");
        graph.addEdge("E", "F");
        graph.addEdge("F", "G");

        graph.printGraph();
    }
}
