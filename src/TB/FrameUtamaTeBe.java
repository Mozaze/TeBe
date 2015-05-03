/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TB;

/**
 *
 * @author mozaze
 */
import java.awt.*;
import javax.swing.*;
public class FrameUtamaTeBe {
    
    public FrameUtamaTeBe(String title){
        super(title);
        setLayout(new BorderLayout());
        
        
        final JTextArea textArea= new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        JScrollPane kolomKanan= new JScrollPane(textArea);
        kolomKanan.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        PanelKiri kolomKiri=new PanelKiri();
        kolomKiri.addDetailListener(new TeBeEventListener(){
            @Override
            public void TeBeEvent(TeBeEvent event){
                String text=event.getText();
            }
        });
        
        Container c= getContentPane();
        c.add(kolomKanan,BorderLayout.CENTER);
        c.add(kolomKiri,BorderLayout.WEST);
        
    }
    
}
