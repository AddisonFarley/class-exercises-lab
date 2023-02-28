//Addison Farley
//SDEV 219
//Class Exercises

package Q1;

import java.math.*;

public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this(0,0);
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public boolean isLocatedAtOrigin()
    {
        if(x == 0 && y == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double distance(double xOther, double yOther)
    {
        return Math.sqrt(Math.pow((x - xOther), 2) + Math.pow((y - yOther), 2));
    }

    @Override
    public String toString()
    {
        return "Point - x: " + x + ", y: " + y;
    }
}
