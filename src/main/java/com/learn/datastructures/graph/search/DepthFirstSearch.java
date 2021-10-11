package com.learn.datastructures.graph.search;

import java.util.*;

public class DepthFirstSearch<T> {

    private final Graph<T> graph;

    public DepthFirstSearch(Graph<T> graph) {
        this.graph = graph;
    }

    public void performDepthFirstSearch(T start) {
        Stack<T> visitedStack = new Stack<>();
        Set<T> traversalSet = new HashSet<>();
        visitedStack.push(start);

        while (!visitedStack.isEmpty()) {
            T data = visitedStack.pop();
            if(traversalSet.add(data)){
                System.out.println("Visited" + data);
            }
            final List<Graph.Vertex<T>> adjacencyList = graph.getAdjacencyListMap().get(new Graph.Vertex(data));
            addNeighbourVertices(traversalSet, adjacencyList, visitedStack);
        }

    }

    private void addNeighbourVertices(Set<T> traversalList, List<Graph.Vertex<T>> adjacentVertices, Stack<T> visitedStack) {
        for (int i = 0; i < adjacentVertices.size(); i++) {
            if (!traversalList.contains(adjacentVertices.get(i).getData())) {
                visitedStack.push(adjacentVertices.get(i).getData());
            }
        }
    }
}
