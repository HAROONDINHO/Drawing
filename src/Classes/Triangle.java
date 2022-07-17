package Classes;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {

    private int xArray[];
    private int yArray[];

    public Triangle(int[] xArray, int[] yArray, Color color, boolean fill) {
        super(color, fill);
        this.xArray = xArray;
        this.yArray = yArray;
    }

    public int[] getxArray() {
        return xArray;
    }

    public void setxArray(int[] xArray) {
        this.xArray = xArray;
    }

    public int[] getyArray() {
        return yArray;
    }

    public void setyArray(int[] yArray) {
        this.yArray = yArray;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (!getFill()) {
            g.drawPolygon(xArray, yArray, 3);
        } else {
            g.fillPolygon(xArray, yArray, 3);
        }
    }

    @Override
    public double Area() {
        int x1 = xArray[0];
        int x2 = xArray[1];
        int x3 = xArray[2];
        int y1 = yArray[0];
        int y2 = yArray[1];
        int y3 = yArray[2];
        double area=Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        area=(area/2);
        return area;
    }
    public double Area(int x1, int y1, int x2, int y2, int x3, int y3){
    return (float) Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }
    @Override
    public boolean contains(int x, int y) {
        float A = (float) Area (xArray[0], yArray[0], xArray[1], yArray[1], xArray[2], yArray[2]);
        float A1 = (float) Area (x,y, xArray[1], yArray[1], xArray[2], yArray[2]);
        float A2 = (float) Area (xArray[0], yArray[0], x,y, xArray[2], yArray[2]);
        float A3 = (float) Area (xArray[0], yArray[0], xArray[1], yArray[1], x,y);
        return (A == A1 + A2 + A3);
    }
    
}
