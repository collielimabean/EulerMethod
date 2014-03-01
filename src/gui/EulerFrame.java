package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class EulerFrame
{
    private JFrame frame;
    private JPanel output;
    private JPanel userControl;
    
    private JMenuBar menuBar;
    private JButton simpleItem;
    private JButton trapezoidItem;
    
    public EulerFrame(String title, int width, int height)
    {
        frame = new JFrame(title);
        frame.setSize(width, height);
        
        initComponents();
        
        frame.setJMenuBar(menuBar);
    }
    
    public void display()
    {
        frame.setVisible(true);
    }
    
    private void initComponents()
    {
        output = new JPanel();
        userControl = new JPanel();
        
        menuBar = new JMenuBar();
        
        simpleItem = new JButton("Simple");
        trapezoidItem = new JButton("Trapezoidal");
        
        menuBar.add(simpleItem);
        menuBar.add(trapezoidItem);
    }
    
    
}
