package util;

public class ExpressionParser
{
    private static final String INVALID_CHARS = "^[^@#$%&:'\"{}]+";
    
    public static Expression parse(String input)
    {
        if (input == null)
            throw new ExpressionParseException("Null strings cannot be parsed!");
        
        if (input.matches(INVALID_CHARS))
            throw new ExpressionParseException("Expression has invalid characters!");
        
        //TODO check if valid expression (parantheses are okay, etc)
        
        return new Expression(input);
    }
}
