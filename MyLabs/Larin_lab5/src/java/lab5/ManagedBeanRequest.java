/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
/**
 *
 * @author stu-ist109
 */
@ManagedBean(name="ManagedBeanRequest")
@RequestScoped

public class ManagedBeanRequest {
    @ManagedProperty(value="#{ManagedBeanSession}")

    private ManagedBeanSession sess;

    private String email;
    private String password;
    private String fio;
    private String date;
    //@Min(value=0, message="Возраст больше 0 меньше 130") @Max(130)
    private int age;
    
    private String message;
    

    /** Creates a new instance of ManagedBeanRequest */
    public ManagedBeanRequest() {
    }
    public void ok() {
        message = "Регистрация успешно завершена! "+" Ваш email " + email + " Вас зовут: " + fio +" Вам " + age +" лет "+ " Сегодня " + date;
    }
    /**
     * @return the sess
     */
    public ManagedBeanSession getSess() {
        return sess;
    }

    /**
     * @param sess the sess to set
     */
    public void setSess(ManagedBeanSession sess) {
        this.sess = sess;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the date
     */


    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the fio
     */
    public String getFio() {
        return fio;
    }

    /**
     * @param fio the fio to set
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the age
     */

    /**
     * @return the date
     */


   
}
