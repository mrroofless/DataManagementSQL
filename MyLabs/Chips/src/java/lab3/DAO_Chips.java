package lab3;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu-ist109
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DAO_Chips {

   
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private Connection conn;

    static void print(String string) {
        System.out.println(string);
    }

    public DAO_Chips() throws DAO_ChipsException, NamingException {
           /*    try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/test?user=root&password=root");
            conn.setCatalog("chips");
        } catch (SQLException ex) {
            throw new DAO_ChipsException(ex.getMessage());
        }
    }*/
        try {
            InitialContext ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/chips");
            Connection conn = ds.getConnection();
            conn.setCatalog("chips");
        } catch (SQLException ex) {
            throw new DAO_ChipsException(ex.getMessage());
        }
    }
    
   
    public Chips getChips(int id) throws DAO_ChipsException {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Chips where id_chip=?");
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                String id_chip = result.getString(1);
                String marking = result.getString(2);
                String  digit_capacity= result.getString(3);
                String date_of_output = result.getString(5);
                String capacity = result.getString(4);
                String access_time = result.getString(6);
                String cost = result.getString(8);
                String popular = result.getString(7);
                return new Chips(id_chip, marking, digit_capacity, capacity, date_of_output, access_time, popular, cost);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (SQLException ex) {
            throw new DAO_ChipsException(ex.getMessage());
        }
    }

    public void addChips(Chips ft) throws DAO_ChipsException {
        try {
            PreparedStatement ps = conn.prepareStatement("insert Chips values(?,?,?,?,?,?,?)");
            ps.setString(1, ft.getId_chip());
            ps.setString(2, ft.getMarking());
            ps.setString(3, ft.getDigit_capacity());
            ps.setString(5,ft.getDate_of_output());
            ps.setString(4, ft.getCapacity());
            ps.setString(6, ft.getAccess_time());
            ps.setString(7, ft.getPopular());
            ps.setString(8, ft.getCost());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new DAO_ChipsException(ex.getMessage());
        }
    }


        public void removeChips(int id)throws DAO_ChipsException{
        try {
            PreparedStatement ps = conn.prepareStatement("delete from Chips where id_chip=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch (SQLException ex){
            throw new DAO_ChipsException(ex.getMessage());
        }
    }
      /*  public void insert(Chips c) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/test?user=root&password=root");
            conn.setCatalog("chips");

            PreparedStatement stmt = conn.prepareStatement("insert into Chips values(" + c.getId_chip() + "," + c.getMarking() + ",' " + c.getDigit_capacity() + "'," + " ' " + c.getCapacity() + "'  " + c.getDate_of_output()+ "' +" + c.getAccess_time()+ "' +" +c.getPopular()+ "' +" +c.getCost()+ "' +" +"'");
            stmt.execute();
        } catch (SQLException ex) {
            System.out.print("Ошибка синтаксиса SQL!");

        }
    } */
        public Chips select(int id) {


        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/test?user=root&password=root");
            conn.setCatalog("chips");

            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("select * from Chips where id=" + id + ";");

            rs.next();
            Chips c = new Chips(
                    rs.getString("id_chip"),
                    rs.getString("marking"),
                    rs.getString("digit_capacity"),
                    rs.getString("capacity"),
                    rs.getString("date_of_output"),
                    rs.getString("access_time"),
                     rs.getString("popular"),
                     rs.getString("cost"));

            return c;
        } catch (SQLException ex) {
            System.out.print("Ошибка синтаксиса SQL!");
            return null;

        }


    }
    }




