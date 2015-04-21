import java.util.EventObject;

public class GuestbookEvent extends EventObject{
    private String text;
    public GuestbookEvent(Object source, String text){ //constructor
        super(source);
        this.text = text;
    }
    
    public String getText(){
        return text;
    }
}
