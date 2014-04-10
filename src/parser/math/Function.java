package parser.math;

import java.util.ArrayList;
import java.util.List;

abstract class Function
{
    protected double coefficient;
    protected Operator internalOperator;
    protected List<Function> subFunctions;
    
    Function(Operator operator)
    {
        this.internalOperator = operator;
        coefficient = 1;
        subFunctions = new ArrayList<Function>();
    }
    
    abstract double evaluate(Point p);
}
