package Classes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
    
    private Color color;
    private boolean fill;

    public Shape(Color color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }
    
    public void setFill(boolean fill)
    {
        this.fill = fill;
    }
    public boolean getFill()
    {
        return fill;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract void draw (Graphics g);
    public abstract double Area();
    public abstract boolean contains(int x,int y);
    
}
