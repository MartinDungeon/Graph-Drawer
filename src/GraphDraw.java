import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markn
 */
public class GraphDraw
{
    private final Graph graph;
    private final boolean directedGraph;
    private final PanelTools panelTools;
    private final Graphics2D gfx;
    GraphDraw(Graph graph, boolean directedGraph, JPanel jpanel)
    {
        gfx = (Graphics2D)jpanel.getGraphics();
        this.graph = graph;
        this.directedGraph=directedGraph;
        panelTools = new PanelTools(graph.getNumberOfNodes(), jpanel);
    }
    private void InitializeNodesPosition() 
    {
        for (int i=0 ; i<graph.getNumberOfNodes() ; i++)
        {
            Point newPointPosition = new Point(panelTools.generateNewPointPosition());
            graph.setNodePosition(i, newPointPosition);
        }
    }
    private void DrawLines()
    {
        for (int i=0 ; i<graph.getEdgesList().size() ; i++)
        {

            Point fromPoint = graph.getEdgesList().get(i).getFromPoint().getNodeposition();//new Point(.get(edgesList.get(i).getKey()).x, nodesPositionsList.get(edgesList.get(i).getKey()).y);
            Point toPoint = graph.getEdgesList().get(i).getToPoint().getNodeposition();//new Point(nodesPositionsList.get(edgesList.get(i).getValue()).x, nodesPositionsList.get(edgesList.get(i).getValue()).y);
            gfx.drawLine(fromPoint.x, fromPoint.y, toPoint.x, toPoint.y);
            if (directedGraph)
                DrawArrow(fromPoint, toPoint);
        }
    }
    private void DrawArrow(Point fromPoint, Point toPoint) 
    {
        Point midPoint = new Point((fromPoint.x+toPoint.x)/2, (fromPoint.y+toPoint.y)/2);
        double rotate = Math.atan2(toPoint.y - fromPoint.y, toPoint.x - fromPoint.x);
        AffineTransform transform = new AffineTransform();
        transform.translate(midPoint.x, midPoint.y);
        transform.rotate(rotate);
        gfx.fill(transform.createTransformedShape(panelTools.getArrowPolygon()));
    }
    private void DrawNodes()
    {
        for (int i=0 ; i<graph.getNumberOfNodes() ; i++)
        {
            
            int xPosition=graph.getNodesList().get(i).getNodeposition().x;
            int yPosition=graph.getNodesList().get(i).getNodeposition().y;
            gfx.setColor(Color.WHITE);
            gfx.fillOval(xPosition-25, yPosition-25, 50, 50);
            
            gfx.setColor(Color.BLACK);
            gfx.drawOval(xPosition-25, yPosition-25, 50, 50);
            String nodeNum=String.valueOf(i+1);
            gfx.drawString(nodeNum, xPosition-(nodeNum.length()==1?3:6), yPosition+3);
        }
    }
    public void DrawGraph()
    {
        InitializeNodesPosition();
        DrawLines();
        DrawNodes();
    }
}
