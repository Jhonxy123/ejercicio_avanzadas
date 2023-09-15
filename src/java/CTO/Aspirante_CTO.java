/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CTO;

import Modelo.Aspirante;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Santiago199
 */
public class Aspirante_CTO extends HttpServlet {

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
            out.println("<title>Servlet Aspirante_CTO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Aspirante_CTO at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
        
        String[] materiassleccionadas = request.getParameterValues("materia");
        String nombre = request.getParameter("txtNombre");
        String email = request.getParameter("txtEmail");
        String telefono = request.getParameter("txtTelefono");
        List<String> materias = Arrays.asList(materiassleccionadas);
        LocalDate fecha_actual=LocalDate.now();
        
        Aspirante asp=new Aspirante(nombre, email, telefono, materias, fecha_actual);
        
        request.setAttribute("listaAspirantes", Aspirante.listaA);

        System.out.println("nombre: "+nombre);
        System.out.println("email: "+email);
        System.out.println("telefono: "+telefono);
        System.out.println("materias: "+asp.getMaterias());
        
        List<Aspirante> aspirantes = Aspirante.listaA;
      
        // Itera sobre la lista y muestra los datos en la consola
        for (Aspirante aspirante : aspirantes) {
            System.out.println("Nombre_lista: " + aspirante.getNombre());
            System.out.println("Correo_lista: " + aspirante.getCorreo());
            System.out.println("Teléfono_lista: " + aspirante.getTelefono());
            // Muestra otros atributos según sea necesario
        }
        
        response.sendRedirect("salida.jsp");
         
        
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
