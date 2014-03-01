package euler;

public class SimpleEulerMethod 
{
    public static double EPSILON = 1e-4; 
    
    protected double step;
    protected double current;
    protected double end;
    protected double initial;
    
    protected Point point;
    
    public SimpleEulerMethod(double stepSize, Point initialPoint, double endPoint)
    {
        step = stepSize;
        end = endPoint;
        
        point = initialPoint;
        
        current = initialPoint.getX();
        initial = initialPoint.getY();
    }
    
    public static void setEpsilon(double newEpsilon)
    {
        EPSILON = newEpsilon;
    }
    
    public double slopeFunction(Point point)
    {
        //TODO will be dynamic, amirite?
        return (point.getX() + point.getY());
    }
    
    public final double getApproximation()
    {
        if(!isEndReachable())
            throw new IllegalArgumentException(); //TODO Handle this elegantly
        
        if(current == end)
            return initial;
        
        double approx = point.getY();
        
        while(Math.abs(current - end) >= EPSILON)
        {
            approx = approximate(approx);
            
            current += step;
            point = new Point(current, approx);
            System.out.println("Current: " + current + " | Value: " + approx);
        }
        
        return approx;
    }
    
    protected double approximate(double previousEstimate)
    {
        previousEstimate += step * slopeFunction(point);
        
        return previousEstimate;
    }
    
    private boolean isEndReachable()
    {
        int endSign = (int) Math.signum(end - current);
        int stepSign = (int) Math.signum(step);
        
        if(endSign != stepSign)
            return false;
        
        if(endSign == 0 && stepSign == 0)
            return true;
        
        double diff = ((end - current) / step) % 1;
        
        if((diff > 0.5) && (1 - diff < EPSILON))
            return true;
        
        if((diff < 0.5) && (diff <= EPSILON))
            return true;
        
        return false;
    }
    
}
