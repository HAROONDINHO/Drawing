package GUI;
import Classes.Rectangle;
import Classes.Shape;
import Classes.Triangle;
import Classes.Line;
import Classes.Circle;
import Classes.Square;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JPanel implements MouseListener, MouseMotionListener{
    ArrayList<Shape> shapes;
    ArrayList<Shape> temp;
    ArrayList<Shape> delTemp;
    private Color currentcolor;
    private boolean fill;
    int mode = -1;
    int x1,y1;
    int x2,y2;
    int indMin= -1;
    
    
    public Board()
    {
        shapes = new ArrayList<>();
        currentcolor = Color.black;
        fill = false;
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void setCurrentcolor(Color c)
    {
        currentcolor=c;
    }
    public void setFill(boolean b)
    {
        fill = b;
    }
    
    public int select(int x, int y)
    {
        indMin = -1;
        ArrayList<Integer> index = new ArrayList<>();   
        int i; 
        for(i=0;i<shapes.size();i++)
        {
            if(shapes.get(i).contains(x,y))
                index.add(i);
        }
        if(index.size()!=0)
        {
            double minArea = shapes.get(index.get(0)).Area();
            indMin = index.get(0);
            for(i=0;i<index.size();i++)
            {
                if(shapes.get(index.get(i)).Area()<minArea)
                {
                    minArea = shapes.get(index.get(i)).Area();
                    indMin = index.get(i);
                }
            }
            repaint();
 
        }
        return indMin;
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int i;
        for(i = 0; i<shapes.size(); i++)   
                shapes.get(i).draw(g);
            
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        
        if (mode == 5) //delete
        {
            int a = select(x1,y1);
            if (a>=0)
            {
                temp.add(shapes.get(a));
                shapes.remove(a);
                repaint();
            }   
        }
        if (mode == 6)
        {
            int a = select(x1,y1);
            if (a>=0)
            {
                Color current = shapes.get(a).getColor();
                shapes.get(a).setColor(Color.MAGENTA);
                
                shapes.remove(a);
                repaint();
            }   
        }
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        if(mode<5)
        {
        temp.clear();
        x1 = e.getX();
        y1 = e.getY();
        switch (mode) {
            case -1:
                JOptionPane.showMessageDialog(this, "Please,Select a shape");
                break;
            case 0:
                Line l = new Line(x1,y1,x1,y1,currentcolor,this.fill);
                shapes.add(l);
                repaint();
                break;
            case 1:
                Rectangle r = new Rectangle(x1,y1,x1,y1,currentcolor,this.fill);
                shapes.add(r);
                repaint();
                break;
            case 2:
                Circle c = new Circle(x1,y1,x1,y1,currentcolor,this.fill);
                shapes.add(c);
                repaint();
                break;
            case 3:
                int arrx[] = {x1,x1,x1};
                int arry[] = {y1,y1,y1};
                Triangle t = new Triangle(arrx,arry,currentcolor,this.fill);
                shapes.add(t);
                repaint();
                break;
            case 4:
                Square s=new Square(x1, x2, y1, y2, currentcolor, fill);
                shapes.add(s);
                repaint();
                break;
            default:
                break;
        }
        }
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {     
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY(); 
        Shape s = shapes.get(shapes.size()-1);
        switch (mode) {
            case -1:
                JOptionPane.showMessageDialog(this, "Please,Select a shape");
                break;
            case 0:
                if(s instanceof Line)
                {
                    Line l = (Line)s;
                    l.setX2(x2);
                    l.setY2(y2);
                }   repaint();
                break;
            case 1:
                if(s instanceof Rectangle)
                {
                    Rectangle r = (Rectangle)s;
                    r.setX2(x2);
                    r.setY2(y2);
                }   repaint();
                break;
            case 2:
                if(s instanceof Circle)
                {
                    Circle c = (Circle)s;
                    c.setX2(x2);
                    c.setY2(y2);
                }   repaint();
                break;
            case 3:
                if(s instanceof Triangle)
                {
                    
                    Triangle t = (Triangle)s;
                    int tX1 = t.getxArray()[0];
                    int arrx[] = {tX1,x2,tX1};
                    int tY1 = t.getyArray()[0];
                    int arry[] = {tY1,y2,y2};
                    t.setxArray(arrx);
                    t.setyArray(arry);
                }   repaint();
                break;
            case 4:
                if(s instanceof Square)
                {
                    Square r = (Square)s;
                    r.setX2(x2);
                    r.setY2(y2);
                }   repaint();
                break;
            default:
                break;   
        }
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {    
    }
}
