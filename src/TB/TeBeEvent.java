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
import java.util.EventObject;
public class TeBeEvent extends EventObject{
    private String text;
    
    public TeBeEvent(Object source,String text){
        super(source);
        this.text=text;
    }
    
    public String getText(){
        return text;
    }
}
