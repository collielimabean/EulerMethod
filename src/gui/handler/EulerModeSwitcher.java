package gui.handler;

import euler.EulerType;
import gui.EulerFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EulerModeSwitcher implements ActionListener
{
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        Object src = event.getSource();
        
        JButton button = new JButton();
        
        if(src instanceof JButton)
            button = (JButton) src;
        
        switch(button.getText())
        {
            case EulerType.SIMPLE:
                
            case EulerType.TRAPEZOIDAL:
                
                
            default:
                return;
        }
    }

}
