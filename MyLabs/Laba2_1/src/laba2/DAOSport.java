package laba2;

//import java.util.ArrayList;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilya270392
 */
import java.sql.*;

public class DAOSport {

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

    public DAOSport() throws DAOSportException {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/test?user=root&password=");
            conn.setCatalog("labaSBD2");
        } catch (SQLException ex) {
            throw new DAOSportException(ex.getMessage());
        }
    }

    public Sportsmen getSportsmen(int id) throws DAOSportException {
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Sportsmen where ID_Sportsmena=?");
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                int ID_Sportsmena = result.getInt(1);
                String FIO = result.getString(2);
                String Vid_Sporta = result.getString(3);
               // Date Data_Rogdenia = result.getDate(4);
                int Dohod = result.getInt(5);
                int Stagh_Raboti = result.getInt(6);
                int Vozrast = result.getInt(7);
                return new Sportsmen(ID_Sportsmena, FIO, Vid_Sporta, Dohod, Stagh_Raboti, Vozrast);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (SQLException ex) {
            throw new DAOSportException(ex.getMessage());
        }
    }

    public void addSportsmen(Sportsmen ft) throws DAOSportException {
        try {
            PreparedStatement ps = conn.prepareStatement("insert Sportsmen values(?,?,?,?,?,?,?)");
            ps.setInt(1, ft.getID_Sportsmena());
            ps.setString(2, ft.getFIO());
            ps.setString(3, ft.getVid_Sporta());
           // ps.setDate(4,ft.getData_Rogdenia());
            ps.setInt(5, ft.getDohod());
            ps.setInt(6, ft.getStagh_Raboti());
            ps.setInt(7, ft.getVozrast());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOSportException(ex.getMessage());
        }
    }


        public void removeSportsmen(int id)throws DAOSportException{
        try {
            PreparedStatement ps = conn.prepareStatement("delete from Sportsmen where id_Sportsmen=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch (SQLException ex){
            throw new DAOSportException(ex.getMessage());
        }
    }




}

   /* Object Sportsmen() {
        throw new UnsupportedOperationException("Not yet implemented");
    }*/

  

  
