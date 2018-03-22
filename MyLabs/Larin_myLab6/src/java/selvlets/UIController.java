package selvlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import serv.*;
import java.util.*;
import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.sql.DataSource;

public class UIController extends HttpServlet {

    ForestryDAO forestryDAO;

    @Resource(name = "jdbc/clients")
    private DataSource ds;

    @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        try{
            InitialContext ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("java:comp/env/jdbc/clients");
            forestryDAO = new ForestryDAO(ds.getConnection());
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String address = request.getParameter("address");
            Client client = new Client(fname, lname, address);
            forestryDAO.addClient(client);
            List clients = forestryDAO.getAllClient();
            request.setAttribute("clients", clients);
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/output.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e){
            System.err.println(e);
        } finally {
            out.close();
        }
    }

}
