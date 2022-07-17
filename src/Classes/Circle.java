package Classes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

    private int x1, y1;
    private int x2, y2;

    public Circle(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        super(color, fill);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        int r;
        if (!getFill()) {
            if (x1<x2&&y1<y2) {
                r=Math.abs(x2-x1);
                g.drawOval(x1,y1,r,r);
            } else if (x1>x2&&y1>y2) {
                r = Math.abs(x2-x1);
                g.drawOval(x2,y2, r,r);
            } else if (x1>x2&&y1<y2) {
                r=Math.abs(x2-x1);
                g.drawOval(x2,y1,r,r );
            } else {
                r=Math.abs(x2-x1);
                g.drawOval(x1,y2, r, r);
            }
        } else {
            if (x1<x2&&y1<y2) {
                r=Math.abs(x2-x1);
                g.fillOval(x1,y1,r,r);
                //g.fillOval(x1,y1,x2-x1,y2-y1);
            } else if (x1>x2&&y1>y2){
                r = Math.abs(x2-x1);
                g.fillOval(x2,y2, r,r);
                //g.fillOval(x2,y2, Math.abs(x2-x1), Math.abs(y2-y1));
            } else if (x1>x2&&y1<y2) {
                r=Math.abs(x2-x1);
                g.fillOval(x2,y1,r,r );
               // g.fillOval(x2,y1, Math.abs(x2-x1), Math.abs(y2-y1));
            } else {
                 r=Math.abs(x2-x1);
                g.fillOval(x1,y2, r, r);
                //g.fillOval(x1,y2, Math.abs(x2-x1), Math.abs(y2-y1));
            }
        }
    }

    @Override
    public double Area() {
        int a=Math.abs(x2-x1);
        int b=Math.abs(y2-y1);
        return Math.PI*(a/2)*(b/2);
    }

    @Override
    public boolean contains(int x, int y) {
        int a=Math.abs(x2-x1);
        int b=Math.abs(y2-y1);
        double h=((x2+x1)*1.0)/2;
        double k=((y2+y1)*1.0)/2;
        double p = ((Math.pow((x - h), 2) / Math.pow(a, 2))
            + (Math.pow((y - k), 2) / Math.pow(b, 2)));
        return p<=1;
    }
}
