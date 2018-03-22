package serv;
import java.sql.*;
import java.util.ArrayList;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ForestryDAO {

    static{

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    private Connection conn;
    PreparedStatement getClientSt;
    PreparedStatement getAllClientSt;
    PreparedStatement addClientSt;
    PreparedStatement removeClientSt;


    static void print(String string){
        System.out.println(string);
    }

    public ForestryDAO(Connection con)throws ForestryDAOException {
        try{
            
            conn = con;
 /*           conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/test?user=root&password=root");*/
            conn.setCatalog("forestry");
            getClientSt = conn.prepareStatement("select * from client where id_client=?");
            getAllClientSt = conn.prepareStatement("select * from client");
            addClientSt = conn.prepareStatement("insert client (FName, LName, Address) values(?,?,?)");
        }
        catch (SQLException ex){
            throw new ForestryDAOException(ex.getMessage());
        }
    }


    public Client getClient(int id) throws ForestryDAOException{
        try{
            getClientSt.setInt(1, id);
            ResultSet result = getClientSt.executeQuery();
            if (result.next()) {
                int id_client = result.getInt(1);
                String fname = result.getString(2);
                String lname = result.getString(3);
                String address = result.getString(4);
                return new Client(id_client, fname, lname, address);
            }
            else throw new IllegalArgumentException();
        }
        catch (SQLException ex){
            throw new ForestryDAOException(ex.getMessage());
        }
    }

    public ArrayList<Client> getAllClient() throws ForestryDAOException{
        ArrayList<Client> result = new ArrayList<Client>();
        try{
            ResultSet resultset = getAllClientSt.executeQuery();
            while (resultset.next()) {
                int id_client = resultset.getInt(1);
                String fname = resultset.getString(2);
                String lname = resultset.getString(3);
                String address = resultset.getString(4);
                result.add(new Client(id_client, fname, lname, address));
            }
        }
        catch (SQLException ex){
            throw new ForestryDAOException(ex.getMessage());
        }
        return result;
    }

    public void addClient(Client ft) throws ForestryDAOException{
        try{
            addClientSt.setString(1, ft.getFname());
            addClientSt.setString(2, ft.getLname());
            addClientSt.setString(3, ft.getAddress());
            addClientSt.executeUpdate();
        }
        catch(SQLException ex){
            throw new ForestryDAOException(ex.getMessage());
        }
    }

}
