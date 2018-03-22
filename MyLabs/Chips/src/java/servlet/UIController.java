/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lab3.*;

/**
 *
 * @author stu-ist109
 */
public class UIController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            DAO_Chips fd = new DAO_Chips();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UIController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UIController at " + fd.getChips(1) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e){
            System.err.println(e);
        } finally {
            out.close();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            DAO_Chips fd = new DAO_Chips();
            String id_chip = request.getParameter("id_chip");
            String marking = request.getParameter("marking");

            String digit_capacity = request.getParameter("digit_capacity");
            String capacity = request.getParameter("capacity");
            String date_of_output = request.getParameter("date_of_output");
            String access_time = request.getParameter("access_time");
            String popular = request.getParameter("popular");
            String cost = request.getParameter("cost");
            Chips chips = new Chips(id_chip, marking, digit_capacity, capacity, date_of_output, access_time, popular, cost);
            fd.addChips(chips);
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Response input</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Информация о чипе занесена в БД</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e){
            System.err.println(e);
        } finally {
            out.close();
        }
        //processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */



