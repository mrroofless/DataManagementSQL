/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author stu-ist109
 */
@ManagedBean
@SessionScoped
public class ManagedBeanSession {
    
private int counter;
    /** Creates a new instance of ManagedBeanSession */
    public ManagedBeanSession() {
    }

    /**
     * @return the counter
     */
    public int getCounter() {
        return counter;
    }

    /**
     * @param counter the counter to set
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }

}