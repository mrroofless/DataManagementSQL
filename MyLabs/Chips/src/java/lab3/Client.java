package lab3;


import javax.naming.NamingException;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu-ist109
 */


public class Client {

public static void main (String... args) throws DAO_ChipsException, NamingException{
DAO_Chips ft = new DAO_Chips();
//System.out.println(ft.getChips(1).toString());

ft.removeChips(6);

System.out.println(ft.getChips(5).toString());

Chips c = new Chips("7","Goldstar KVR800D2N6/1G","128", "1024", "2008/02/02", "1", "yes", "100");

//c= ft.select(3);

//ft.insert(c);
System.out.println("");
System.out.println( c.getId_chip());
System.out.println( c.getMarking());
System.out.println( c.getDigit_capacity());
System.out.println( c.getDate_of_output());
System.out.println( c.getCapacity());
System.out.println( c.getAccess_time());
System.out.println( c.getPopular());
System.out.println( c.getCost());

}
}
