package euler;

import java.util.List;
import java.util.ArrayList;

import parser.math.Point;

public class SimpleEulerMethod 
{
    public static double EPSILON = 1e-4; 
    
    protected double step;
    protected double current;
    protected double end;
    protected double initial;
    protected Point point;
    
    private List<Point> data;
    
    public SimpleEulerMethod(double stepSize, Point initialPoint, double endPoint)
    {
        step = stepSize;
        end = endPoint;
        
        point = initialPoint;
        
        current = initialPoint.getX();
        initial = initialPoint.getY();
        
        data = new ArrayList<Point>();
    }
    
    public static void setEpsilon(double newEpsilon)
    {
        EPSILON = newEpsilon;
    }
    
    public double slopeFunction(Point point)
    {
        return (point.getY() * point.getY());
    }
    
    public final List<Point> getApproximation()
    {
        double approx = point.getY();
        
        while(Math.abs(current - end) >= EPSILON)
        {
            approx = approximate(approx);
            
            current += step;
            point = new Point(current, approx);
            
            data.add(new Point(current, approx));
        }
        
        return data;
    }
    
    protected double approximate(double previousEstimate)
    {
        previousEstimate += step * slopeFunction(point);
        
        return previousEstimate;
    }
    
}
