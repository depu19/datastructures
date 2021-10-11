package com.learn.datastructures.graph.search;

import com.learn.datastructures.queue.Queue;

import java.util.*;

public class BreadthFirstSearch<T> {

    private final Graph<T> graph;
    private T repeatedVertexData;

    public BreadthFirstSearch(Graph<T> graph) {
        this.graph = graph;
    }

    public void breadthFirstSearchTraversal(T data) {
        Graph.Vertex<T> dataVertex = new Graph.Vertex(data);
        final Set<T> visitedVertexSet = new HashSet<>();
        final Queue<T> neighbourVertexQueue = new Queue<>();
        final Map<Graph.Vertex, List<Graph.Vertex<T>>> adjacencyListMap = graph.getAdjacencyListMap();

        if (!adjacencyListMap.containsKey(dataVertex)) {
            System.out.println("Vertex does not exist in graph");
        } else {
            neighbourVertexQueue.enqueue(data);
            while (!neighbourVertexQueue.isEmpty()) {

                data = neighbourVertexQueue.dequeue();
                if (visitedVertexSet.add(data)) {
                    System.out.println(" Visited " + data);
                    final List<Graph.Vertex<T>> vertices = adjacencyListMap.get(new Graph.Vertex(data));
                    addNeighbourVertices(neighbourVertexQueue, vertices, visitedVertexSet);

                }
            }
        }
    }

    private void addNeighbourVertices(Queue<T> neighbourVertexQueue, List<Graph.Vertex<T>> neighbourVertices,
                                      Set<T> visitedVertexSet) {

        for (int i = 0; i < neighbourVertices.size(); i++) {
            T nextVertexData = neighbourVertices.get(i).getData();

            if (!visitedVertexSet.contains(nextVertexData)) {
                    if(nextVertexData.equals(repeatedVertexData)) {
                        System.out.println(" Cycle detected at corner Vertex" + nextVertexData);
                    }
                repeatedVertexData = nextVertexData;
                neighbourVertexQueue.enqueue(nextVertexData);

            }
        }
    }
}
