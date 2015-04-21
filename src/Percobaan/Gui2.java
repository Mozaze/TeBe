/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author mozaze
 */
import javax.swing.JButton;
import javax.swing.JFrame;
public class Gui2 extends JFrame{
    
    private static final long serialVersionUID =1L;
    
    private JButton button;
    public Gui2(){
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button = new JButton();
        button.setBounds(60,60,150,40);
        button.setText("aku adalah button");
        this.getContentPane().add(button);
        
        
        this.setVisible(true);
    }
}
