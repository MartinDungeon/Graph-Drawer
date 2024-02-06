/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
import java.awt.Point;
import java.util.*;
import javafx.util.Pair;
public class Graph {
    private  int numberOfNodes;
    private final ArrayList<Edge>edgesList = new ArrayList<>();;
    private final ArrayList<Node>nodesList = new ArrayList<>();;
    HashSet< Pair<Node, Node> > found;
    public Graph(int numberOfNodes) 
    {
        Node.resetNumberOfNodes();
        this.numberOfNodes = numberOfNodes;
        found = new HashSet<>();
        for(int i = 0;i < this.numberOfNodes;i++)
            nodesList.add(new Node());
    }
    void addEdge(Node from, Node to,int weight)
    {
        edgesList.add(new Edge(from, to,weight));
        found.add(new Pair<>(from, to));
    }
    boolean check(Pair<Node, Node> connection)
    {
        return !(found.contains(connection));
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public ArrayList<Edge> getEdgesList() {
        return edgesList;
    }

    void setNodePosition(int index, Point pointPosition) 
    {
        nodesList.get(index).setNodeposition(pointPosition);
    }

    public ArrayList<Node> getNodesList() {
        return nodesList;
    }
    public boolean addNode()
    {
        if(numberOfNodes<14)
        {
            numberOfNodes++;
            nodesList.add(new Node());
            return true;
        }
        else
            return false;
    }
    
}
