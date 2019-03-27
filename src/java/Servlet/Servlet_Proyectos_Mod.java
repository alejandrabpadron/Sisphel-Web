package Servlet;

import Operaciones.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Proyectos_Mod extends HttpServlet {

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

        java.io.PrintWriter out = response.getWriter();
        try {

//---------------------BOTONES PROYECTOS DE INVESTIGACIÓN GIBM---------------------

            String ProyectosGIBM = request.getParameter("ProyectosGIBM");

            if (ProyectosGIBM != null) {
                Vector v = Consultar_Proyectos.ListarProyectosGIBM();
                request.setAttribute("Proyectos", v);
                request.getRequestDispatcher("/JSP/Proyectos_GIBM_Mod.jsp").forward(request, response);
            }



// *************HASTA AQUÍ BOTONES PROYECTOS DE INVESTIGACIÓN GIBM***************




//---------------------BOTONES PROYECTOS DE INVESTIGACIÓN GIETRB---------------------


            String ProyectosGIETRB = request.getParameter("ProyectosGIETRB");


            if (ProyectosGIETRB != null) {
                Vector v = Consultar_Proyectos.ListarProyectosGIETRB();
                request.setAttribute("Proyectos", v);
                request.getRequestDispatcher("/JSP/Proyectos_GIETRB_Mod.jsp").forward(request, response);
            }



// *************HASTA AQUÍ BOTONES PROYECTOS DE INVESTIGACIÓN GIETRB***************






//---------------------BOTONES PRODUCCIÓN CIENTÍFICA GIBM---------------------
            String ProduccionGIBM = request.getParameter("ProduccionGIBM");


            if (ProduccionGIBM != null) {

                Vector v = Consultar_Produccion.ListarProduccionGIBM();
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Produccion_GIBM_Mod.jsp").forward(request, response);

            }

// *************HASTA AQUÍ BOTONES PRODUCCIÓN CIENTÍFICA GIBM***************




//---------------------BOTONES PRODUCCIÓN CIENTÍFICA GIETRB---------------------
            String ProduccionGIETRB = request.getParameter("ProduccionGIETRB");

            if (ProduccionGIETRB != null) {

                Vector v = Consultar_Produccion.ListarProduccionGIETRB();
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Produccion_GIETRB_Mod.jsp").forward(request, response);

            }

// *************HASTA AQUÍ BOTONES PRODUCCIÓN CIENTÍFICA GIETRB***************





//---------------------BOTONES PONENCIAS Y EVENTOS  GIBM---------------------
            String PonenciasGIBM = request.getParameter("PonenciasGIBM");

            if (PonenciasGIBM != null) {

                Vector v = Consultar_Ponencias.ListarPonenciasGIBM();
                request.setAttribute("Ponencias", v);
                request.getRequestDispatcher("/JSP/Ponencias_GIBM_Mod.jsp").forward(request, response);

            }

// *************HASTA AQUÍ BOTONES PONENCIAS Y EVENTOS GIBM***************






//---------------------BOTONES PONENCIAS Y EVENTOS  GIETRB---------------------
            String PonenciasGIETRB = request.getParameter("PonenciasGIETRB");

            if (PonenciasGIETRB != null) {

                Vector v = Consultar_Ponencias.ListarPonenciasGIETRB();
                request.setAttribute("Ponencias", v);
                request.getRequestDispatcher("/JSP/Ponencias_GIETRB_Mod.jsp").forward(request, response);

            }

// *************HASTA AQUÍ BOTONES PONENCIAS Y EVENTOS GIETRB***************




//---------------------BOTONES PREMIOS Y DISTINCIONES  GIBM---------------------
            String PremiosGIBM = request.getParameter("PremiosGIBM");


            if (PremiosGIBM != null) {

                Vector v = Consultar_Premios.ListarPremiosGIBM();
                request.setAttribute("Premios", v);
                request.getRequestDispatcher("/JSP/Premios_GIBM_Mod.jsp").forward(request, response);

            }

// *************HASTA AQUÍ BOTONES PREMIOS Y DISTINCIONES GIBM***************





//---------------------BOTONES PREMIOS Y DISTINCIONES  GIETRB---------------------

            String PremiosGIETRB = request.getParameter("PremiosGIETRB");

            if (PremiosGIETRB != null) {

                Vector v = Consultar_Premios.ListarPremiosGIETRB();
                request.setAttribute("Premios", v);
                request.getRequestDispatcher("/JSP/Premios_GIETRB_Mod.jsp").forward(request, response);

            }

// *************HASTA AQUÍ BOTONES PREMIOS Y DISTINCIONES GIETRB***************







//---------------------BOTON INICIO MENÚ PROYECTOS---------------------
            String Inicio = request.getParameter("Inicio");
            if (Inicio != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Mod.jsp").forward(request, response);
            }

            String Contacto = request.getParameter("Contacto");
            if (Contacto != null) {
                request.getRequestDispatcher("/JSP/Contacto_Mod.jsp").forward(request, response);
            }
// *************HASTA AQUÍ BOTON INICIO MENÚ PROYECTOS***************






//----------------------------BOTONES NOTICIAS ----------------------

            String Noticias = request.getParameter("Noticias");
            String VerNoticias = request.getParameter("VerNoticias");
            String NuevaNoticia = request.getParameter("NuevaNoticia");
            String Guardar_Noticia = request.getParameter("Guardar_Noticia");
            String EditarNoticia = request.getParameter("EditarNoticia");
            String Nombre_Noticias = request.getParameter("Nombre_Noticias");
            String Buscar_Noticia = request.getParameter("Buscar_Noticias");
            String Editar_Noticia = request.getParameter("Actualizar_Noticia");
            String EliminarNoticia = request.getParameter("EliminarNoticia");
            String Buscar_Eliminar = request.getParameter("Buscar_Eliminar");
            String Eliminar_Noticia = request.getParameter("Eliminar_Noticia");
            if (Noticias != null) {

                request.getRequestDispatcher("/JSP/Proyectos_Mod.jsp").forward(request, response);

            }

            if (VerNoticias != null) {
                Vector v = Consultar_Noticias.ListarNoticias();
                request.setAttribute("Noticias", v);
                request.getRequestDispatcher("/JSP/Noticias_Mod.jsp").forward(request, response);

            }

//************************HASTA AQUÍ BOTONES NOTICIAS**********************





//---------------------BOTONES GRUPOS---------------------
            String Grupos = request.getParameter("Grupos");
            String GIBM = request.getParameter("GIBM");
            String GIETRB = request.getParameter("GIETRB");

            if (Grupos != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Mod.jsp").forward(request, response);
            }

            if (GIBM != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Mod.jsp").forward(request, response);
            }
            if (GIETRB != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Mod.jsp").forward(request, response);
            }
// *************HASTA AQUÍ BOTONES GRUPOS***************


        } catch (Exception e) {
            request.setAttribute("msg", e.getMessage());
            request.setAttribute("target", "/Sisphel_Web/JSP/Proyectos_Mod.jsp");
            request.getRequestDispatcher("ServletError").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
