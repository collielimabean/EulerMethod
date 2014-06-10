package util;

public class Expression
{
    private static final char[] ALLOWED_CHARS = {'x', 'y'};
    private String equation;
    private int numVariables;
    
    public Expression(String equation)
    {
        this.equation = convertPostFixNotation(equation);
        
        for (char var : ALLOWED_CHARS)
            if (equation.indexOf(var) != -1)
                numVariables++;
        
        //TODO Check if already a number: if so, slap into equation and done
        // if numerical expression, evaluate it
    }
    
    public double evaluate(Point point)
    {
        //TODO evaluate
        // substitute x -> equation
        // substitute y -> 
        
        return 0;
    }
    
    private String convertPostFixNotation(String equation)
    {
        //TODO
        
        return null;
    }
}
