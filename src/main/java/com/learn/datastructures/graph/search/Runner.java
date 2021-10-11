package com.learn.datastructures.graph.search;



public class Runner {

    public static void main(String[] args) {

        Graph<String> graph = getGraph3();
        performBFS(graph, "1");
    }

    private static void performBFS(Graph graph, String startNode){
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(graph);
        breadthFirstSearch.breadthFirstSearchTraversal(startNode);
    }

    private static void performDFS(Graph graph, String startNode){
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph);
        depthFirstSearch.performDepthFirstSearch(startNode);
    }

    private static Graph<String> getGraph3() {
        Graph<String> graph = new Graph<>();
        Graph.Vertex<String> one = new Graph.Vertex<>("1");
        Graph.Vertex<String> two = new Graph.Vertex<>("2");
        Graph.Vertex<String> three = new Graph.Vertex<>("3");
        Graph.Vertex<String> four = new Graph.Vertex<>("4");
        Graph.Vertex<String> five = new Graph.Vertex<>("5");
        Graph.Vertex<String> six = new Graph.Vertex<>("6");
        Graph.Vertex<String> seven = new Graph.Vertex<>("7");
        Graph.Vertex<String> eight = new Graph.Vertex<>("8");
        Graph.Vertex<String> nine = new Graph.Vertex<>("9");
        Graph.Vertex<String> ten = new Graph.Vertex<>("10");

        graph.addVertex(one);
        graph.addVertex(two);
        graph.addVertex(three);
        graph.addVertex(four);
        graph.addVertex(five);
        graph.addVertex(six);
        graph.addVertex(seven);
        graph.addVertex(eight);
        graph.addVertex(nine);
        graph.addVertex(ten);

        graph.addEdge(one,two,true);
        graph.addEdge(two,three,true);
        graph.addEdge(two, four,true);
        graph.addEdge(four,three ,true);
        graph.addEdge(one,five ,true);
        graph.addEdge(five,six ,true);
        graph.addEdge(seven,six ,true);
        graph.addEdge(eight,six ,true);

        graph.addEdge(three,nine ,true);
        graph.addEdge(nine,ten ,true);
        return graph;
    }

    private static Graph<String> getGraph2() {
        Graph<String> graph = new Graph<>();
        Graph.Vertex<String> one = new Graph.Vertex<>("1");
        Graph.Vertex<String> two = new Graph.Vertex<>("2");
        Graph.Vertex<String> three = new Graph.Vertex<>("3");
        Graph.Vertex<String> four = new Graph.Vertex<>("4");
        Graph.Vertex<String> five = new Graph.Vertex<>("5");
        Graph.Vertex<String> six = new Graph.Vertex<>("6");
        graph.addVertex(one);
        graph.addVertex(two);
        graph.addVertex(three);
        graph.addVertex(four);
        graph.addVertex(five);
        graph.addVertex(six);
        graph.addEdge(one,two,true);
        graph.addEdge(two,three,true);
        graph.addEdge(three, four,true);
        graph.addEdge(three,five,true);
        graph.addEdge(six,four,true);
        graph.addEdge(six,five,true);
        return graph;
    }

    private static Graph<String> getGraph1() {
        Graph<String> graph = new Graph<>();
        Graph.Vertex<String> one = new Graph.Vertex<>("1");
        Graph.Vertex<String> two = new Graph.Vertex<>("2");
        Graph.Vertex<String> three = new Graph.Vertex<>("3");
        Graph.Vertex<String> four = new Graph.Vertex<>("4");
        Graph.Vertex<String> five = new Graph.Vertex<>("5");
        Graph.Vertex<String> six = new Graph.Vertex<>("6");
        Graph.Vertex<String> seven = new Graph.Vertex<>("7");
        Graph.Vertex<String> eight = new Graph.Vertex<>("8");
        Graph.Vertex<String> nine = new Graph.Vertex<>("9");
        Graph.Vertex<String> ten = new Graph.Vertex<>("10");
        Graph.Vertex<String> eleven = new Graph.Vertex<>("11");
        Graph.Vertex<String> twelve = new Graph.Vertex<>("12");
        graph.addVertex(one);
        graph.addVertex(two);
        graph.addVertex(three);
        graph.addVertex(four);
        graph.addVertex(five);
        graph.addVertex(six);
        graph.addVertex(seven);
        graph.addVertex(eight);
        graph.addVertex(nine);
        graph.addVertex(ten);
        graph.addVertex(eleven);
        graph.addVertex(twelve);

        graph.addEdge(one,two,true);
        graph.addEdge(one,three,true);
        graph.addEdge(one, four,true);
        graph.addEdge(five,two,true);
        graph.addEdge(five,nine,true);
        graph.addEdge(five, ten,true);

        graph.addEdge(six, two,true);
        graph.addEdge(six, ten,true);

        graph.addEdge(eight, four,true);
        graph.addEdge(seven, four,true);
        graph.addEdge(seven, eleven,true);
        graph.addEdge(seven, twelve,true);
        return graph;
    }
}
