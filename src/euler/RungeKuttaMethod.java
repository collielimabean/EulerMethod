package euler;

import util.Expression;
import util.Point;


public class RungeKuttaMethod extends SimpleEulerMethod
{
    
    public RungeKuttaMethod(Expression exp, double stepSize, Point initialPoint, double endPoint)
    {
        super(exp, stepSize, initialPoint, endPoint);
    }
    
    protected double approximate(double previousEstimate)
    {
        double m_0 = diffeq.evaluate(point);
        double y_half_1 = previousEstimate + (step / 2.0)*(m_0);
        
        double m_half_1 = diffeq.evaluate(new Point(point.getX() + step / 2.0, y_half_1));
        double y_half_2 = previousEstimate + (step / 2.0) * (m_half_1);
        
        double m_half_2 = diffeq.evaluate(new Point(point.getX() + step / 2.0, y_half_2));
        double y_1 = previousEstimate + step * m_half_2;
        
        double m_1 = diffeq.evaluate(new Point(point.getX() + step, y_1));
        
        return previousEstimate + (step / 6.0) * (m_0 + 2 * m_half_1 + 2 * m_half_2 + m_1);
    }
}
