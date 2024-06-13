package main;

import graph.Vertex;
import algorithm.BreadthFirstSearch;

public class App {
    public static void main(String[] args){

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        a.addNeighbour(b);
        a.addNeighbour(c);
        c.addNeighbour(d);
        c.addNeighbour(e);

        breadthFirstSearch.traverse(a);
    }
}
