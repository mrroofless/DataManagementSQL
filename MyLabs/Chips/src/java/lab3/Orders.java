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


public class Orders {

    private int order_id;
private int id_prod;
private int id_chip;
private int id_cust;
private int number_of_chips;
private Date date_of_order;
private String execute;

    /**
     * @return the order_id
     */
    public int getOrder_id() {
        return order_id;
    }

    /**
     * @param order_id the order_id to set
     */
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    /**
     * @return the id_prod
     */
    public int getId_prod() {
        return id_prod;
    }

    /**
     * @param id_prod the id_prod to set
     */
    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
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
     * @return the id_cust
     */
    public int getId_cust() {
        return id_cust;
    }

    /**
     * @param id_cust the id_cust to set
     */
    public void setId_cust(int id_cust) {
        this.id_cust = id_cust;
    }

    /**
     * @return the number_of_chips
     */
    public int getNumber_of_chips() {
        return number_of_chips;
    }

    /**
     * @param number_of_chips the number_of_chips to set
     */
    public void setNumber_of_chips(int number_of_chips) {
        this.number_of_chips = number_of_chips;
    }

    /**
     * @return the date_of_order
     */
    public Date getDate_of_order() {
        return date_of_order;
    }

    /**
     * @param date_of_order the date_of_order to set
     */
    public void setDate_of_order(Date date_of_order) {
        this.date_of_order = date_of_order;
    }

    /**
     * @return the execute
     */
    public String getExecute() {
        return execute;
    }

    /**
     * @param execute the execute to set
     */
    public void setExecute(String execute) {
        this.execute = execute;
    }

}
