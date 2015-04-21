import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FrameUtama extends JFrame{
        
    public FrameUtama(String title){//contructor
        super(title);
        
        //1. set layout manager
        setLayout(new BorderLayout());
        
        //2. create swing component
        final JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        
        
        JScrollPane kolomKanan = new JScrollPane(textArea);
        kolomKanan.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        PanelKiri kolomKiri = new PanelKiri();
        kolomKiri.addDetailListener(new GuestbookEventListener(){

            @Override
            public void EventGuestbook(GuestbookEvent event) {
                String text = event.getText();
                textArea.append(text);
                
            }
            
        });
        
        //3. add swing component to the content pane
        Container c = getContentPane();
        c.add(kolomKanan, BorderLayout.CENTER);
        c.add(kolomKiri, BorderLayout.WEST);
    }
}
