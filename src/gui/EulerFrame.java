package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EulerFrame
{
    private JFrame frame;
    private JPanel outputPanel;
    private JPanel userControlPanel;
    
    private JMenuBar menuBar;
    private JButton simpleItem;
    private JButton trapezoidItem;
    
    private JScrollPane output;
    private JTextArea logger;
    
    private JTextField inputFunction;
    private JTextField initialT;
    private JTextField initialValue;
    private JTextField inputStep;
    private JTextField inputEnd;
    private JButton submit;
    
    public EulerFrame(String title, int width, int height)
    {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new GridLayout(0, 1, 0, 0));
        
        initComponents();
        
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(outputPanel);
        frame.getContentPane().add(userControlPanel);

    }
    
    public void display()
    {
        frame.setVisible(true);
    }
    
    private void initComponents()
    {
        initMenuBar();
        initLoggerComponents();
        initUserInputComponents();
    }
    
    private void initMenuBar()
    {
        simpleItem = new JButton("Simple");
        trapezoidItem = new JButton("Trapezoidal");

        menuBar = new JMenuBar();
        menuBar.add(simpleItem);
        menuBar.add(trapezoidItem);
    }
    
    private void initLoggerComponents()
    {
        logger = new JTextArea();
        logger.setLineWrap(true);
        logger.setEditable(false);
        
        output = new JScrollPane(logger);
        
        outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        outputPanel.setSize(frame.getSize());
        
        outputPanel.add(output, BorderLayout.CENTER);
    }
    
    private void initUserInputComponents()
    {
        userControlPanel = new JPanel();
        
    }
}
