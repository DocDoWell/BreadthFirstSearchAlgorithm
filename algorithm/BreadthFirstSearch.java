package algorithm;

import java.util.LinkedList;
import java.util.Queue;

import graph.Vertex;

public class BreadthFirstSearch {
    int i = 1;
    public void traverse(Vertex root){
        Queue<Vertex> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            Vertex actual = queue.remove();

            if(i == 1){
                System.out.println("1st Vertex searched is " + actual.getName());
            }else if(i == 2){
                System.out.println("2nd Vertex searched is " + actual.getName());
            }else if(i == 3){
                System.out.println("3rd Vertex searched is " + actual.getName());
            }else{
                System.out.println(i+"th Vertex searched is " + actual.getName());
            }

            i++;

            for(Vertex neighbour: actual.getAdjacentVertex()){
                if(!neighbour.isVisited()){
                    neighbour.setVisited(true);
                    queue.add(neighbour);
                }
            }
        }
    }
}
