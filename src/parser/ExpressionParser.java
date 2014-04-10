package parser;

import parser.math.Equation;

public class ExpressionParser 
{
    private String input;
    private Equation equation;
    
    public ExpressionParser(String input)
    {
        this.input = input;
        equation = new Equation();
    }
    
    public void parse()
    {
        //TODO take in string and split into +, - but also
        //retain the + or - information
    }
    
    public Equation getEquation()
    {
        return equation;
    }
    
}