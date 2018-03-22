
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;
/**
 *
 * @author stu-ist109
 */
@ManagedBean
@RequestScoped
public class ManagedBeanRequest {
    private String marking;
    private int capacity;
    private Date date_of_output;
    private int price;
    private int number;
    private int result;

    private ManagedBeanSession mbs;

    /** Creates a new instance of ManagedBeanRequest */
    public ManagedBeanRequest() {
    }

    /**
     * @return the marking
     */
    public String getMarking() {
        return marking;
    }

    /**
     * @param marking the marking to set
     */
    public void setMarking(String marking) {
        this.marking = marking;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the date_of_output
     */
    public Date getDate_of_output() {
        return date_of_output;
    }

    /**
     * @param date_of_output the date_of_output to set
     */
    public void setDate_of_output(Date date_of_output) {
        this.date_of_output = date_of_output;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the mbs
     */
    public ManagedBeanSession getMbs() {
        return mbs;
    }

    /**
     * @param mbs the mbs to set
     */
    public void setMbs(ManagedBeanSession mbs) {
        this.mbs = mbs;
    }
    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(int result) {
        this.result = result;
    }
        public String Count(){
        int i = getMbs().getCounter();
        getMbs().setCounter(i+1);
        if (marking == null ? "samsung" == null : marking.equals("samsung")) price=1000;
        if (marking == null ? "kingston" == null : marking.equals("kingston")) price=2000;
        if (marking == null ? "ibm" == null : marking.equals("ibm")) price=10000;
        result=price * number;
        return "result";
    }


}

