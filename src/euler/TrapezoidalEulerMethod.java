package euler;

import util.Expression;
import util.Point;


public class TrapezoidalEulerMethod extends SimpleEulerMethod 
{

    public TrapezoidalEulerMethod(Expression exp, double stepSize, Point initialPoint, double endPoint) 
    {
        super(exp, stepSize, initialPoint, endPoint);
    }
    
    protected double approximate(double previousEstimate)
    {
        double preEstimate = super.approximate(previousEstimate);
        
        previousEstimate += (step / 2.0) * (diffeq.evaluate(point) 
                + diffeq.evaluate(new Point(current + step, preEstimate)));
        
        return previousEstimate;
    }
}
