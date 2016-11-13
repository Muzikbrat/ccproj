/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

/**
 *
 * @author Mahe
 */
public class welcome extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           Random rand = null;
           
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            PrintWriter out= response.getWriter();
        
        //out.print("<h1>hello</h1>");
        Random randomGenerator = new Random();
              int randomInt;
           randomInt = randomGenerator.nextInt(5);
           out.println("<html> <body style=\"background: url(ball.jpg); background-repeat: no-repeat; background-attachment: fixed; background-position: center;\"> <h1 style=\"text-align: center;font-family: 'Times New Roman', Times, serif;\">Your Destiny</h1>");
           switch(randomInt)
           {
               case 1: out.print("<h1 style= \"text-align: center; color: blue \"> Yes, why not. Seems like a good idea as your stars are aligned perfectly </h1>");
                        break;
               case 2: out.print("<h1 style=\"text-align: center; colour:  green \">Maybe, your drive is positive but the path is difficult</h1>");
                        break;
               case 3: out.print("<h1 style= \" text-align: center;color: cyan \"> Plan a little more, patience will bear  sweet results</h1>");
                       break;
               case 4: out.print("<h1 style= \" text-align: center; color: red \"> No. This is not a good idea for now. Leave the idea</h1>");
                        break;
               case 5: out.print("<h1 style= \"text-align: center; color: blue \"> Never ever try this. It is not meant for you</h1>");
                        break;
               default: out.print("<h1 style= \"color: blue \"> Unsure of how you well you would do</h1>");
                            break;
           }
           out.println("</body></html>");
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
