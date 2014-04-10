package euler;

import parser.math.Point;

public class TrapezoidalEulerMethod extends SimpleEulerMethod 
{

    public TrapezoidalEulerMethod(double stepSize, Point initialPoint, double endPoint) 
    {
        super(stepSize, initialPoint, endPoint);
    }
    
    protected double approximate(double previousEstimate)
    {
        double preEstimate = super.approximate(previousEstimate);
        
        previousEstimate += (step / 2.0) * (slopeFunction(point) 
                + slopeFunction(new Point(current + step, preEstimate)));
        
        return previousEstimate;
    }
}
