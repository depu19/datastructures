package com.learn.datastructures.graph;

import com.learn.datastructures.graph.search.BreadthFirstSearch;


public class Runner {

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        Graph.Vertex<String> alice = new Graph.Vertex<>("Alice");
        Graph.Vertex<String> bob = new Graph.Vertex<>("Bob");
        Graph.Vertex<String> rob = new Graph.Vertex<>("Rob");
        Graph.Vertex<String> maria = new Graph.Vertex<>("Maria");
        Graph.Vertex<String> mark = new Graph.Vertex<>("Mark");
        graph.addVertex(alice);
        graph.addVertex(bob);
        graph.addVertex(rob);
        graph.addVertex(maria);
        graph.addVertex(mark);

        graph.addEdge(bob,alice,true);
        graph.addEdge(bob,rob,true);
        graph.addEdge(alice,mark,true);
        graph.addEdge(rob,mark,true);
        graph.addEdge(alice,maria,true);
        graph.addEdge(rob,maria,true);

    }
}
