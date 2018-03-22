/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu-ist109
 */
import java.sql.Date;

public class Customers {
    private int id_cust;
private String title_customer;
private String home_country;
private Date date_of_beginning;
private int number_of_staff;
private int annual_income;

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
     * @return the title_customer
     */
    public String getTitle_customer() {
        return title_customer;
    }

    /**
     * @param title_customer the title_customer to set
     */
    public void setTitle_customer(String title_customer) {
        this.title_customer = title_customer;
    }

    /**
     * @return the home_country
     */
    public String getHome_country() {
        return home_country;
    }

    /**
     * @param home_country the home_country to set
     */
    public void setHome_country(String home_country) {
        this.home_country = home_country;
    }

    /**
     * @return the date_of_beginning
     */
    public Date getDate_of_beginning() {
        return date_of_beginning;
    }

    /**
     * @param date_of_beginning the date_of_beginning to set
     */
    public void setDate_of_beginning(Date date_of_beginning) {
        this.date_of_beginning = date_of_beginning;
    }

    /**
     * @return the number_of_staff
     */
    public int getNumber_of_staff() {
        return number_of_staff;
    }

    /**
     * @param number_of_staff the number_of_staff to set
     */
    public void setNumber_of_staff(int number_of_staff) {
        this.number_of_staff = number_of_staff;
    }

    /**
     * @return the annual_income
     */
    public int getAnnual_income() {
        return annual_income;
    }

    /**
     * @param annual_income the annual_income to set
     */
    public void setAnnual_income(int annual_income) {
        this.annual_income = annual_income;
    }

}
