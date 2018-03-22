package lab3;

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
    private String id_chip;
private String marking;
private String digit_capacity;
private String capacity;
private String date_of_output;
private String access_time;
private String popular;
private String cost;

public Chips (String id_chip, String marking, String digit_capacity, String capacity, String date_of_output, String access_time, String popular, String cost) {
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


     /*      Chips(String id_chip, String marking, String digit_capacity, String capacity, String date_of_output, String access_time, String popular, String cost) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
*/
    /**
     * @return the id_chip
     */
    public String getId_chip() {
        return id_chip;
    }

    /**
     * @param id_chip the id_chip to set
     */
    public void setId_chip(String id_chip) {
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
    public String getDigit_capacity() {
        return digit_capacity;
    }

    /**
     * @param digit_capacity the digit_capacity to set
     */
    public void setDigit_capacity(String digit_capacity) {
        this.digit_capacity = digit_capacity;
    }

    /**
     * @return the capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
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

    /**
     * @return the access_time
     */
    public String getAccess_time() {
        return access_time;
    }

    /**
     * @param access_time the access_time to set
     */
    public void setAccess_time(String access_time) {
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
    public String getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(String cost) {
        this.cost = cost;
    }
    /**
     * @return the id_chip
     */


}
