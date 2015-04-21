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
public class SimpleGui {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        JButton Button = new JButton("klik saya");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(Button);
        
        frame.setSize(300,300);
        
        frame.setVisible(true);
    }
}
