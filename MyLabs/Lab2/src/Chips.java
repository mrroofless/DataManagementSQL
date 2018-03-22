/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu-ist109
 */
import java.sql.Date;

public class Chips {
    private int id_chip;
private String marking;
private int digit_capacity;
private int capacity;
private String date_of_output;
private int access_time;
private String popular;
private int cost;

public Chips (int id_chip, String marking, int digit_capacity, int capacity, String date_of_output, int access_time, String popular, int cost) {
    this.id_chip=id_chip;
    this.access_time=access_time;
    this.capacity=capacity;
    this.cost=cost;
    this.date_of_output=date_of_output;
    this.digit_capacity=digit_capacity;
    this.marking=marking;
    this.popular=popular;
    /*
    setId_chip(id_chip);
    setMarking(marking);
    setDigit_capacity(digit_capacity);
    setCapacity(capacity);
    setDate_of_output(date_of_output);
    setAccess_time(access_time);
    setPopular(popular);
    setCost(cost);
*/
}
    /**
     * @return the id_chip
     */
    public int getId_chip() {
        return id_chip;
    }

    /**
     * @param id_chip the id_chip to set
     */
    public void setId_chip(int id_chip) {
        this.id_chip = id_chip;
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
     * @return the digit_capacity
     */
    public int getDigit_capacity() {
        return digit_capacity;
    }

    /**
     * @param digit_capacity the digit_capacity to set
     */
    public void setDigit_capacity(int digit_capacity) {
        this.digit_capacity = digit_capacity;
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
     * @return the access_time
     */
    public int getAccess_time() {
        return access_time;
    }

    /**
     * @param access_time the access_time to set
     */
    public void setAccess_time(int access_time) {
        this.access_time = access_time;
    }

    /**
     * @return the popular
     */
    public String getPopular() {
        return popular;
    }

    /**
     * @param popular the popular to set
     */
    public void setPopular(String popular) {
        this.popular = popular;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the date_of_output
     */
    public String getDate_of_output() {
        return date_of_output;
    }

    /**
     * @param date_of_output the date_of_output to set
     */
    public void setDate_of_output(String date_of_output) {
        this.date_of_output = date_of_output;
    }

}
