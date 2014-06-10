package util;

@SuppressWarnings("serial")
public class ExpressionParseException extends RuntimeException
{
    public ExpressionParseException()
    {
        super();
    }
    
    public ExpressionParseException(String message)
    {
        super(message);
    }
}
