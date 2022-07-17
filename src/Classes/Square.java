package Classes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape{
    private int x1,x2,y1,y2;
    int length;

    public Square(int x1, int x2, int y1, int y2, Color color, boolean fill) {
        super(color, fill);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        
        if (!getFill()) {
            if (x1<x2&&y1<y2) {
                length=Math.abs(y2-y1); //medany mkhaleha x2-x1
                g.drawRect(x1,y1,length,length);
            } else if (x1>x2&&y1>y2) {
                length=Math.abs(y2-y1);
                g.drawRect(x1 - length, y1 - length, length, length);
            } else if (x1>x2&&y1<y2) {
                length=Math.abs(x2-x1);
                g.drawRect(x2,y1,length,length );
            } else {
                length=Math.abs(y2-y1);
                g.drawRect(x1,y2, length, length);
            }
        } else {
            if (x1<x2&&y1<y2) {
                length=Math.abs(y2-y1);
                g.fillRect(x1,y1,length,length);
            } else if (x1>x2&&y1>y2){
                length=Math.abs(y2-y1);
                g.fillRect(x1 - length, y1 - length, length, length);
            } else if (x1>x2&&y1<y2) {
                length=Math.abs(x2-x1);
                g.fillRect(x2,y1, length, length);
            } else {
                length=Math.abs(y2-y1);
                g.fillRect(x1,y2,length,length);
            }
        }
    }

    @Override
    public double Area() {
        return Math.pow(length,2);
    }

    @Override
    public boolean contains(int x, int y){
        if(x1<x2&&y1<y2)
        {
            length=Math.abs(y2-y1);
            if(x<=x1+length && x>=x1 && y<=y1+length && y>=y1)
               return true;
        }
        else if (x1>x2&&y1>y2)
        {
            length=Math.abs(y2-y1);
            if(x<=x2+length && x>=x2 && y<=y2+length && y>=y2)
               return true;
        }
        else if (x1>x2&&y1<y2)
        {
            length=Math.abs(x2-x1);
            if(x<=x2+length && x>=x2 && y<=y1+length && y>=y1)
               return true;
        }
        else
        {
        length=Math.abs(y2-y1);
        if(x<=x1+length && x>=x1 && y<=y2+length && y>=y2)
            return true;
        }
        return false;
    }
    
}
