import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JavaGuestbook {
    public static void main(String[] Args){
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                JFrame frame = new FrameUtama("Java Guestbook v1.0");
                frame.setSize(600,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
            
        });
    }
}
