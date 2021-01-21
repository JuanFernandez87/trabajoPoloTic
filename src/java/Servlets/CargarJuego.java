/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juanf
 */
@WebServlet(name = "CargarJuego", urlPatterns = {"/CargarJuego"})
public class CargarJuego extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CargarJuego</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CargarJuego at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String nombre = request.getParameter("nombreJuego"); //Obtengo el nombre de usuario que se ingreso
        String dia = request.getParameter("diaJuego");
        String inicio = request.getParameter("inicioJuego");
        String fin = request.getParameter("finJuego");
        int capacidad = Integer.parseInt(request.getParameter("capacidadJuego"));    
      
    Controladora control = new Controladora();
    
    control.crearJuego(nombre, dia, inicio, fin, capacidad);
    
    request.getSession().setAttribute("nombreJuego", nombre);
    request.getSession().setAttribute("diaJuego", dia);
    request.getSession().setAttribute("inicioJuego", inicio);
    request.getSession().setAttribute("finJuego", fin);
    request.getSession().setAttribute("capacidadJuego", capacidad);
    
    response.sendRedirect("Mostrar.jsp"); //Muestra los datos ingresados
    
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
