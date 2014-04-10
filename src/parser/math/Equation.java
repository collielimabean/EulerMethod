package parser.math;


public class Equation
{
    private FunctionNode head;
    private FunctionNode tail;
    
    public Equation()
    {
        head = null;
        tail = null;
    }
    
    public void appendFunction(Function function, Operator connect)
    {
        if(!(connect.equals(Operator.PLUS) || connect.equals(Operator.MINUS)))
            throw new IllegalArgumentException("Only + and - are allowed.");
        
        if(head == null)
        {
            head = new FunctionNode(function, null, connect);
            tail = head;
            return;
        }
        
        FunctionNode node = new FunctionNode(function, null, connect);
        
        tail.setNext(node);
        tail = tail.getNext();
    }
    
    public double getValueAtPoint(Point p)
    {
        FunctionNode traverse = head;
        
        double value = 0;
        
        while(traverse.getNext() != null)
        {
            switch(traverse.getOperator())
            {
                case PLUS:
                    value += traverse.getCurrent().evaluate(p);
                    break;
                    
                case MINUS:
                    value -= traverse.getCurrent().evaluate(p);
                    break;
                    
                default:
                   System.err.println("Something went wrong - not supposed to happen"); 
                   break;
            }
            
            traverse = traverse.getNext();
        }
        
        return value;
    }
}
