/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu-ist109
 */
import java.sql.Date;

public class Produsers {
    private int id_prod;
private String title_produser;
private String home_country;
private Date date_of_beginning;
private int number_of_staff;
private int annual_income;

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
     * @return the title_produser
     */
    public String getTitle_produser() {
        return title_produser;
    }

    /**
     * @param title_produser the title_produser to set
     */
    public void setTitle_produser(String title_produser) {
        this.title_produser = title_produser;
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
