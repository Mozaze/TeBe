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
//import com.sun.prism.Graphics;
import java.awt.*;
import javax.swing.*;

public class DrawMyPanel extends JPanel{
    
    public void paintComponent(Graphics g){
        g.setColor(Color.red);
        g.fillRect(20, 50, 100, 100);
    }
    
    public static void main(String [] args){
        DrawMyPanel panel = new DrawMyPanel();
        panel.paintComponent(Graphics g);
    }
}
