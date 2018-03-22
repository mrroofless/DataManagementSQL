/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serv;

import javax.servlet.ServletException;

/**
 *
 * @author stu-ist109
 */
public class NewException extends ServletException {

    /**
     * Creates a new instance of <code>NewException</code> without detail message.
     */
    public NewException() {
    }


    /**
     * Constructs an instance of <code>NewException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public NewException(String msg) {
        super(msg);
    }
}
