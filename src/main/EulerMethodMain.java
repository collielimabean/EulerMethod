package main;

import euler.Point;
import euler.SimpleEulerMethod;
import gui.EulerFrame;

public class EulerMethodMain 
{
    
    public static final double STEP_SIZE = 0;
    public static final Point INITIAL_CONDITION = new Point(0, 1);
    public static final double END_POINT = 0;
    
    public static void main(String[] args)
    {
        //TODO Implement
        EulerFrame frame = new EulerFrame("Euler Method", 300, 400);
        frame.display();
    }
        
}
