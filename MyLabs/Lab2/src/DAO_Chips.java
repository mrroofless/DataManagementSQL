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

    public DAO_Chips() throws DAO_ChipsException {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/test?user=root&password=root");
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
                int id_chip = result.getInt(1);
                String marking = result.getString(2);
                int  digit_capacity= result.getInt(3);
                String date_of_output = result.getString(5);
                int capacity = result.getInt(4);
                int access_time = result.getInt(6);
                int cost = result.getInt(8);
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
            ps.setInt(1, ft.getId_chip());
            ps.setString(2, ft.getMarking());
            ps.setInt(3, ft.getDigit_capacity());
            ps.setString(5,ft.getDate_of_output());
            ps.setInt(4, ft.getCapacity());
            ps.setInt(6, ft.getAccess_time());
            ps.setString(7, ft.getPopular());
            ps.setInt(8, ft.getCost());
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
                    rs.getInt("id_chip"),
                    rs.getString("marking"),
                    rs.getInt("digit_capacity"),
                    rs.getInt("capacity"),
                    rs.getString("date_of_output"),
                    rs.getInt("access_time"),
                     rs.getString("popular"),
                     rs.getInt("cost"));

            return c;
        } catch (SQLException ex) {
            System.out.print("Ошибка синтаксиса SQL!");
            return null;

        }


    }
    }




