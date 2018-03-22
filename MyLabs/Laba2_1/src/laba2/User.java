/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package laba2;

/**
 *
 * @author ilya270392
 */
public class User {
public static void main (String... args) throws DAOSportException{
DAOSport ft = new DAOSport();
System.out.println(ft.getSportsmen(3).toString());
//System.out.println(ft.removeSportsmen(6).toString());
}
}
