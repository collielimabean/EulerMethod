package parser.math;

class FunctionNode
{
    private Function current;
    private FunctionNode next;
    private Operator connectingOperator;
    
    FunctionNode()
    {
        this(null, null, null);
    }
    
    FunctionNode(Function current)
    {
        this(current, null, null);
    }
    
    FunctionNode(Function current, FunctionNode next, Operator connecting)
    {
        this.current = current;
        this.next = next;
        connectingOperator = connecting;
    }
    
    public Function getCurrent()
    {
        return current;
    }
    
    public FunctionNode getNext()
    {
        return next;
    }
    
    public void setCurrent(Function newFunction)
    {
        current = newFunction;
    }
    
    public void setNext(FunctionNode newNode)
    {
        next = newNode;
    }
    
    public Operator getOperator()
    {
        return connectingOperator;
    }
    
    public void setOperator(Operator newOp)
    {
        connectingOperator = newOp;
    }
}
