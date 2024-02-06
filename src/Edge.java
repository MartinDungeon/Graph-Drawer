/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Edge {
    private final Node fromPoint, toPoint;
    private final int edgeWeight;
    public Edge(Node fromPoint, Node toPoint, int edgeWeight) {
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.edgeWeight = edgeWeight;
    }

    public Node getFromPoint() {
        return fromPoint;
    }

    public Node getToPoint() {
        return toPoint;
    }

    public int getEdgeWeight() {
        return edgeWeight;
    }
    
}
