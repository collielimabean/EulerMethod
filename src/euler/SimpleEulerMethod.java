package euler;

import java.util.List;
import java.util.ArrayList;

import util.Expression;
import util.Point;

public class SimpleEulerMethod 
{
    public static double EPSILON = 1e-4; 
    
    protected Expression diffeq;
    protected double step;
    protected double current;
    protected double end;
    protected double initial;
    protected Point point;
    
    private List<Point> data;
    
    public SimpleEulerMethod(Expression equation, double stepSize, Point initialPoint, double endPoint)
    {
        diffeq = equation;
        step = stepSize;
        end = endPoint;
        
        point = initialPoint;
        
        current = initialPoint.getX();
        initial = initialPoint.getY();
        
        data = new ArrayList<Point>();
    }
    
    public final Expression getEquation()
    {
        return diffeq;
    }
    
    public final void setDifferentialEquation(Expression exp)
    {
        diffeq = exp;
    }
    
    public final List<Point> getApproximation()
    {
        double approx = point.getY();
        
        while(Math.abs(current - end) - EPSILON >= 0)
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
        previousEstimate += step * diffeq.evaluate(point);
        
        return previousEstimate;
    }
    
}
