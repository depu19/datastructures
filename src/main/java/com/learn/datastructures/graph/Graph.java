package com.learn.datastructures.graph;

import java.util.*;

public class Graph<T>{

    private final Map<Vertex, List<Vertex<T>>> adjacencyList = new HashMap();

    public void addVertex(Vertex<T> vertex) {
       if(vertex != null) { adjacencyList.putIfAbsent(vertex, new ArrayList<>());}
    }

    public void addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, boolean isBiDirectional) {
        List<Vertex<T>> sourceVertexList = adjacencyList.get(sourceVertex);
        sourceVertexList.add(destinationVertex);
        if(isBiDirectional) {
            List<Vertex<T>> destinationVertexList = adjacencyList.get(destinationVertex);
            destinationVertexList.add(sourceVertex);
        }
    }

    public Map<Vertex, List<Vertex<T>>> getAdjacencyListMap() {
        return adjacencyList;
    }
    

    static class Vertex <T>{
        private T data;

        public Vertex(T data) {
            this.data = data;
        }

        public T getData(){return data;};

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vertex<?> vertex = (Vertex<?>) o;
            return Objects.equals(data, vertex.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }
}
