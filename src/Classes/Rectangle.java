package Classes;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
    private int x1,y1;
    private int x2,y2;
    
    public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        super(color,fill);
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
        if(!getFill())
        {
        if(getX1()<getX2() && getY1()<getY2())
            g.drawRect(getX1(),getY1(),getX2()-getX1(),getY2()-getY1());
        else if (getX1()>getX2() && getY1()>getY2())
            g.drawRect(getX2(),getY2(),Math.abs(getX2()-getX1()),Math.abs(getY2()-getY1()));
        else if (getX1()>getX2() && getY1()<getY2())
            g.drawRect(getX2(),getY1(),Math.abs(getX2()-getX1()),Math.abs(getY2()-getY1()));
        else
            g.drawRect(getX1(),getY2(),Math.abs(getX2()-getX1()),Math.abs(getY2()-getY1()));
        }
        else
        {
        if(getX1()<getX2() && getY1()<getY2())
            g.fillRect(getX1(),getY1(),getX2()-getX1(),getY2()-getY1());
        else if (getX1()>getX2() && getY1()>getY2())
            g.fillRect(getX2(),getY2(),Math.abs(getX2()-getX1()),Math.abs(getY2()-getY1()));
        else if (getX1()>getX2() && getY1()<getY2())
            g.fillRect(getX2(),getY1(),Math.abs(getX2()-getX1()),Math.abs(getY2()-getY1()));
        else
            g.fillRect(getX1(),getY2(),Math.abs(getX2()-getX1()),Math.abs(getY2()-getY1()));
        }
    }

    @Override
    public double Area() {
        int width=Math.abs(y2-y1);
        int lenght=Math.abs(x2-x1);
        return lenght*width;
    }

    @Override
    public boolean contains(int x, int y) {
        if(getX1()<getX2() && getY1()<getY2())
        {
            if(x<=x2 && x>=x1 && y<=y2 && y>=y1)
               return true;
        }
        else if (getX1()>getX2() && getY1()>getY2())
        {
            if(x<=x1 && x>=x2 && y<=y1 && y>=y2)
               return true;
        }
        else if (getX1()>getX2() && getY1()<getY2())
        {
            if(x<=x1 && x>=x2 && y<=y2 && y>=y1)
               return true;
        }
        else
        {
        if(x<=x2 && x>=x1 && y<=y1 && y>=y2)
            return true;
        }
        return false;
    }
}
