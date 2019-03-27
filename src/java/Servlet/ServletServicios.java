package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletServicios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
        } finally {
            //out.close();
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
        processRequest(request, response);
        try {
            String Invitado = request.getParameter("Invitado");
            String Inventario_Admin = request.getParameter("Inventario");
            String Horario_Admin = request.getParameter("Horario");
            String Proyectos_Admin = request.getParameter("Proyectos");
            String H_V_Admin = request.getParameter("HV");
            String Si = request.getParameter("Si");
            if (Invitado != null) {
                request.getRequestDispatcher("/JSP/Invitado.jsp").forward(request, response);
            }
            if (Inventario_Admin != null) {
                request.getRequestDispatcher("/JSP/Inventario_Admin.jsp").forward(request, response);
            }
            if (Horario_Admin != null) {
                request.getRequestDispatcher("/JSP/Horario_Admin.jsp").forward(request, response);
            }
            if (Proyectos_Admin != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Admin.jsp").forward(request, response);
            }
            if (H_V_Admin != null) {
                request.getRequestDispatcher("/JSP/HV_Admin.jsp").forward(request, response);
            }
            if (Si != null) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("", e.getMessage());
            request.setAttribute("target", "/Sisphel_Web/Inicio_Admin.jsp");
            request.getRequestDispatcher("ServletError").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
