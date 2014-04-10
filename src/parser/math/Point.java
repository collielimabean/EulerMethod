package parser.math;

public class Point 
{
    private double x;
    private double y;
    private double z;
    
    public Point(double x, double y)
    {
        this(x, y, 0);
    }
    
    public Point(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public double getZ()
    {
        return z;
    }
    
    public void setX(double xValue)
    {
        x = xValue;
    }
    
    public void setY(double yValue)
    {
        y = yValue;
    }
    
    public void setZ(double zValue)
    {
        z = zValue;
    }
    
    public String toString()
    {
        return x + "," + y + "," + z;
    }
}
