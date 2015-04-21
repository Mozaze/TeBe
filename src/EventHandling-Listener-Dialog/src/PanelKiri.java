import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.event.EventListenerList;

public class PanelKiri extends JPanel{
    
    private EventListenerList listenerList = new EventListenerList();
    //dalam java, setiap eventListener maka akan dimasukkan dkedalam 
    //eventListenerList
    
    public void processDetailEvent(GuestbookEvent event){
        Object[] listeners = listenerList.getListenerList();
        //dalam setiap EventListener, maka Java akan menyimpan 
        //listener class dan listener instance
        
        for(int i = 0; i<listeners.length; i+=2){//kita ambil listener class
            if(listeners[i] == GuestbookEventListener.class){
                //kita ambil listener intance dari class
                ((GuestbookEventListener)listeners[i+1]).EventGuestbook(event);
            }
        }
    }
    
    public void addDetailListener(GuestbookEventListener listener){
        listenerList.add(GuestbookEventListener.class, listener);
    }
    
    public void removeDetailListener(GuestbookEventListener listener){
        listenerList.remove(GuestbookEventListener.class, listener);
    }
    
    
    public PanelKiri(){
        //constructor
        setBorder(BorderFactory.createTitledBorder("Mediatutorial Guestbook"));
        Dimension size = getPreferredSize();
        size.width = 250;
        setPreferredSize(size);
        
        //component and label
        JLabel nameLabel = new JLabel("Nama : ");
        JLabel emailLabel = new JLabel("Email : ");
        JLabel messageLabel = new JLabel("Message : ");
        
        final JTextField nameField = new JTextField(10);
        final JTextField emailField = new JTextField(10);
        final JTextArea messageArea = new JTextArea();
        messageArea.setLineWrap(true);
        
        final JScrollPane messageScrollPane = new JScrollPane(messageArea);
        messageScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane.setPreferredSize(new Dimension(170,100));
        
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = nameField.getText();
                String email = emailField.getText();
                String message = messageArea.getText();
                String separator = "----------------\n\n";
                //tanggal
                Date today;
                String dateOut;
                DateFormat formatTanggal = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.MEDIUM);
                
                today = new Date();
                dateOut = formatTanggal.format(today);
                
                if(name.length()<3 || email.length()<3 || message.length()<3){
                    JOptionPane.showMessageDialog(
                                messageScrollPane,
                                "Maap, karakter harus lebih dari 3 huruf",
                                "Invalid Input",
                                JOptionPane.INFORMATION_MESSAGE
                            );
                }
                else{
                    String text = dateOut+"\n"+name+" ("+email+")\n"+message+"\n"+separator;
                    System.out.println(text);
                    processDetailEvent(new GuestbookEvent(this, text));
                }
                        
            }
        
        });
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        
        //FIRST COLUMN
        gc.anchor = GridBagConstraints.LINE_END;
        
        gc.gridx = 0;
        gc.gridy = 0;
        add(nameLabel, gc);
        
        gc.gridx = 0;
        gc.gridy = 1;
        add(emailLabel, gc);
        
        gc.anchor = GridBagConstraints.NORTH;
        gc.gridx = 0;
        gc.gridy = 2;
        add(messageLabel, gc);
        
        //SECOND COLUMN
        gc.anchor = GridBagConstraints.LINE_START;
        
        gc.gridx = 1;
        gc.gridy = 0;
        add(nameField, gc);
        
        gc.gridx = 1;
        gc.gridy = 1;
        add(emailField, gc);
        
        gc.gridx = 1;
        gc.gridy = 2;
        add(messageScrollPane, gc);
        
        ///LAST COLUMN///
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.gridx = 1;
        gc.gridy = 3;
        add(addButton, gc);

        
    }
    
    
}
