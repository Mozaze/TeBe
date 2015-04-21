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
import javax.swing.*;
import java.awt.event.*;
public class SimpleGui1B implements ActionListener {
    JButton button;
    
    public static void main(String [] args){
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
    
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("klik saya");
        
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("saat di klik");//To change body of generated methods, choose Tools | Templates.
    }
    
}
