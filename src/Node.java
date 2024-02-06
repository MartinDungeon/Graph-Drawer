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
public class Node 
{
    final int ID;
    static int count = 1;
    private Point nodeposition;
    public Node() 
    {
        ID = count++;
    }
    public static void resetNumberOfNodes(){
      count = 1;
    }

    public Point getNodeposition() {
        return nodeposition;
    }

    public void setNodeposition(Point nodeposition) {
        this.nodeposition = nodeposition;
    }
    
}
