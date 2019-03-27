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

public class Servlet_Proyectos_Admin extends HttpServlet {

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
            String Insertar_Proyecto_GIBM = request.getParameter("Insertar_Proyecto_GIBM");
            String Guardar_Proyecto_GIBM = request.getParameter("Guardar_Proyecto_GIBM");
            String Modificar_Proyecto_GIBM = request.getParameter("Modificar_Proyecto_GIBM");
            String Buscar_Proyecto_GIBM = request.getParameter("Buscar_Proyecto_GIBM");
            String Nombre_Pro_GIBM = request.getParameter("Nombre_Pro_GIBM");
            String Actualizar_Proyecto_GIBM = request.getParameter("Actualizar_Proyecto_GIBM");


            if (ProyectosGIBM != null) {
                Vector v = Consultar_Proyectos.ListarProyectosGIBM();
                request.setAttribute("Proyectos", v);
                request.getRequestDispatcher("/JSP/Proyectos_GIBM_Admin.jsp").forward(request, response);
            }

            if (Insertar_Proyecto_GIBM != null) {
                request.getRequestDispatcher("/JSP/Insertar_Proyectos_GIBM_Admin.jsp").forward(request, response);
            }

            if (Guardar_Proyecto_GIBM != null) {

                String Titulo_Proyecto_GIBM = request.getParameter("Titulo_Proyecto_GIBM");
                String Grupo_Proyecto_GIBM = request.getParameter("Grupo_Proyecto_GIBM");
                String Estado_Proyecto_GIBM = request.getParameter("Estado_Proyecto_GIBM");

                if (Insertar_Proyectos_GIBM_Admin.ProyectosGIBM(new Insertar_Proyectos_GIBM_Admin(Titulo_Proyecto_GIBM, Grupo_Proyecto_GIBM, Estado_Proyecto_GIBM))) {
                    request.getRequestDispatcher("/JSP/Insertar_Proyectos_GIBM_Admin.jsp").forward(request, response);
                }

            }
            if (Modificar_Proyecto_GIBM != null) {
                request.getRequestDispatcher("/JSP/Buscar_Proyecto_GIBM_Admin.jsp").forward(request, response);
            }
            if (Buscar_Proyecto_GIBM != null) {
                Vector v = Buscar_Proyectos.BuscarGIBM(Nombre_Pro_GIBM);
                request.setAttribute("Proyectos", v);
                request.getRequestDispatcher("/JSP/Buscar_Proyecto_GIBM_Admin2.jsp").forward(request, response);
            }

            if (Actualizar_Proyecto_GIBM != null) {
                String ID_Proyecto_GIBM = request.getParameter("ID_Proyecto_GIBM");
                String Titulo_Proyecto_GIBM = request.getParameter("Titulo_Proyecto_GIBM");
                String Grupo_Proyecto_GIBM = request.getParameter("Grupo_Proyecto_GIBM");
                String Estado_Proyecto_GIBM = request.getParameter("Estado_Proyecto_GIBM");
                if (Actualizar_Proyectos_GIBM.Actualizar(new Actualizar_Proyectos_GIBM(ID_Proyecto_GIBM, Titulo_Proyecto_GIBM, Grupo_Proyecto_GIBM, Estado_Proyecto_GIBM))) {
                    Vector v = Consultar_Proyectos.ListarProyectosGIBM();
                    request.setAttribute("Proyectos", v);
                    request.getRequestDispatcher("/JSP/Proyectos_GIBM_Admin.jsp").forward(request, response);
                    out.print("window.close();");
                }
            }


// *************HASTA AQUÍ BOTONES PROYECTOS DE INVESTIGACIÓN GIBM***************




//---------------------BOTONES PROYECTOS DE INVESTIGACIÓN GIETRB---------------------


            String ProyectosGIETRB = request.getParameter("ProyectosGIETRB");
            String Insertar_Proyecto_GIETRB = request.getParameter("Insertar_Proyecto_GIETRB");
            String Guardar_Proyecto_GIETRB = request.getParameter("Guardar_Proyecto_GIETRB");
            String Modificar_Proyecto_GIETRB = request.getParameter("Modificar_Proyecto_GIETRB");
            String Buscar_Proyecto_GIETRB = request.getParameter("Buscar_Proyecto_GIETRB");
            String Nombre_Pro_GIETRB = request.getParameter("Nombre_Pro_GIETRB");
            String Actualizar_Proyecto_GIETRB = request.getParameter("Actualizar_Proyecto_GIETRB");

            if (ProyectosGIETRB != null) {
                Vector v = Consultar_Proyectos.ListarProyectosGIETRB();
                request.setAttribute("Proyectos", v);
                request.getRequestDispatcher("/JSP/Proyectos_GIETRB_Admin.jsp").forward(request, response);
            }

            if (Insertar_Proyecto_GIETRB != null) {
                request.getRequestDispatcher("/JSP/Insertar_Proyectos_GIETRB_Admin.jsp").forward(request, response);
            }

            if (Guardar_Proyecto_GIETRB != null) {

                String Titulo_Proyecto_GIETRB = request.getParameter("Titulo_Proyecto_GIETRB");
                String Grupo_Proyecto_GIETRB = request.getParameter("Grupo_Proyecto_GIETRB");
                String Estado_Proyecto_GIETRB = request.getParameter("Estado_Proyecto_GIETRB");

                if (Insertar_Proyectos_GIETRB_Admin.ProyectosGIETRB(new Insertar_Proyectos_GIETRB_Admin(Titulo_Proyecto_GIETRB, Grupo_Proyecto_GIETRB, Estado_Proyecto_GIETRB))) {
                    request.getRequestDispatcher("/JSP/Proyectos_GIETRB_Admin.jsp").forward(request, response);
                }

            }
            if (Modificar_Proyecto_GIETRB != null) {
                request.getRequestDispatcher("/JSP/Buscar_Proyecto_GIETRB_Admin.jsp").forward(request, response);
            }

            if (Buscar_Proyecto_GIETRB != null) {
                Vector v = Buscar_Proyectos.BuscarGIETRB(Nombre_Pro_GIETRB);
                request.setAttribute("Proyectos", v);
                request.getRequestDispatcher("/JSP/Buscar_Proyecto_GIETRB_Admin2.jsp").forward(request, response);
            }

            if (Actualizar_Proyecto_GIETRB != null) {
                String ID_Proyecto_GIETRB = request.getParameter("ID_Proyecto_GIETRB");
                String Titulo_Proyecto_GIETRB = request.getParameter("Titulo_Proyecto_GIETRB");
                String Grupo_Proyecto_GIETRB = request.getParameter("Grupo_Proyecto_GIETRB");
                String Estado_Proyecto_GIETRB = request.getParameter("Estado_Proyecto_GIETRB");
                if (Actualizar_Proyectos_GIETRB.Actualizar(new Actualizar_Proyectos_GIETRB(ID_Proyecto_GIETRB, Titulo_Proyecto_GIETRB, Grupo_Proyecto_GIETRB, Estado_Proyecto_GIETRB))) {
                    Vector v = Consultar_Proyectos.ListarProyectosGIETRB();
                    request.setAttribute("Proyectos", v);
                    request.getRequestDispatcher("/JSP/Proyectos_GIETRB_Admin.jsp").forward(request, response);
                }
            }
// *************HASTA AQUÍ BOTONES PROYECTOS DE INVESTIGACIÓN GIETRB***************






//---------------------BOTONES PRODUCCIÓN CIENTÍFICA GIBM---------------------
            String ProduccionGIBM = request.getParameter("ProduccionGIBM");
            String Insertar_Produccion_GIBM = request.getParameter("Insertar_Produccion_GIBM");
            String Guardar_Produccion_GIBM = request.getParameter("Guardar_Produccion_GIBM");
            String Modificar_Produccion_GIBM = request.getParameter("Modificar_Produccion_GIBM");
            String Buscar_Produccion_GIBM = request.getParameter("Buscar_Produccion_GIBM");
            String Nombre_Prod_GIBM = request.getParameter("Nombre_Prod_GIBM");
            String Actualizar_Prod_GIBM = request.getParameter("Actualizar_Produccion_GIBM");
            String Eliminar_Produccion_GIBM = request.getParameter("Eliminar_Produccion_GIBM");
            String Buscar_Eliminar_GIBM = request.getParameter("Buscar_Eliminar_GIBM");
            String Eliminar_Prod_GIBM = request.getParameter("Eliminar_Prod_GIBM");

            if (ProduccionGIBM != null) {

                Vector v = Consultar_Produccion.ListarProduccionGIBM();
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Produccion_GIBM_Admin.jsp").forward(request, response);

            }

            if (Insertar_Produccion_GIBM != null) {

                request.getRequestDispatcher("/JSP/Insertar_Produccion_GIBM_Admin.jsp").forward(request, response);

            }

            if (Guardar_Produccion_GIBM != null) {

                String Autores_Produccion_GIBM = request.getParameter("Autores_Produccion_GIBM");
                String Grupo_Produccion_GIBM = request.getParameter("Grupo_Produccion_GIBM");
                String Titulo_Produccion_GIBM = request.getParameter("Titulo_Produccion_GIBM");
                String Revista_Produccion_GIBM = request.getParameter("Revista_Produccion_GIBM");
                String Tipo_Produccion_GIBM = request.getParameter("Tipo_Produccion_GIBM");
                String Año_Produccion_GIBM = request.getParameter("Ano_Produccion_GIBM");
                String Url_Produccion_GIBM = request.getParameter("Url_Produccion_GIBM");

                if (Insertar_Produccion_GIBM_Admin.ProduccionGIBM(new Insertar_Produccion_GIBM_Admin(Autores_Produccion_GIBM, Grupo_Produccion_GIBM, Titulo_Produccion_GIBM, Revista_Produccion_GIBM, Tipo_Produccion_GIBM, Año_Produccion_GIBM, Url_Produccion_GIBM))) {
                    request.getRequestDispatcher("/JSP/Insertar_Produccion_GIBM_Admin.jsp").forward(request, response);
                }
            }
            if (Modificar_Produccion_GIBM != null) {
                request.getRequestDispatcher("/JSP/Buscar_Produccion_GIBM_Admin.jsp").forward(request, response);
            }
            if (Buscar_Produccion_GIBM != null) {
                Vector v = Buscar_Produccion.BuscarGIBM(Nombre_Prod_GIBM);
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Buscar_Produccion_GIBM_Admin2.jsp").forward(request, response);
            }
            if (Actualizar_Prod_GIBM != null) {
                String ID_Produccion_GIBM = request.getParameter("ID_Produccion_GIBM");
                String Autores_Produccion_GIBM = request.getParameter("Autores_Produccion_GIBM");
                String Grupo_Produccion_GIBM = request.getParameter("Grupo_Produccion_GIBM");
                String Titulo_Produccion_GIBM = request.getParameter("Titulo_Produccion_GIBM");
                String Revista_Produccion_GIBM = request.getParameter("Revista_Produccion_GIBM");
                String Tipo_Produccion_GIBM = request.getParameter("Tipo_Produccion_GIBM");
                String Año_Produccion_GIBM = request.getParameter("Ano_Produccion_GIBM");
                String Url_Produccion_GIBM = request.getParameter("Url_Produccion_GIBM");

                if (Actualizar_Produccion_GIBM.Actualizar(new Actualizar_Produccion_GIBM(ID_Produccion_GIBM, Autores_Produccion_GIBM, Grupo_Produccion_GIBM, Titulo_Produccion_GIBM, Revista_Produccion_GIBM, Tipo_Produccion_GIBM, Año_Produccion_GIBM, Url_Produccion_GIBM))) {
                    Vector v = Consultar_Produccion.ListarProduccionGIBM();
                    request.setAttribute("Produccion", v);
                    request.getRequestDispatcher("/JSP/Produccion_GIBM_Admin.jsp").forward(request, response);
                }
            }
            if (Eliminar_Produccion_GIBM != null) {
                request.getRequestDispatcher("/JSP/Buscar_Eliminar_Produccion_GIBM_Admin.jsp").forward(request, response);
            }
            if (Buscar_Eliminar_GIBM != null) {
                Vector v = Buscar_Produccion.BuscarGIBM(Nombre_Prod_GIBM);
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Buscar_Eliminar_Produccion_GIBM_Admin2.jsp").forward(request, response);
            }
            if (Eliminar_Prod_GIBM != null) {
                String ID_Produccion_GIBM = request.getParameter("ID_Produccion_GIBM");
                String Autores_Produccion_GIBM = request.getParameter("Autores_Produccion_GIBM");
                String Titulo_Produccion_GIBM = request.getParameter("Titulo_Produccion_GIBM");

                if (Eliminar_Produccion_GIBM_Admin.Produccion(new Eliminar_Produccion_GIBM_Admin(ID_Produccion_GIBM, Autores_Produccion_GIBM, Titulo_Produccion_GIBM))) {
                    Vector v = Consultar_Produccion.ListarProduccionGIBM();
                    request.setAttribute("Produccion", v);
                    request.getRequestDispatcher("/JSP/Produccion_GIBM_Admin.jsp").forward(request, response);
                }
            }
// *************HASTA AQUÍ BOTONES PRODUCCIÓN CIENTÍFICA GIBM***************




//---------------------BOTONES PRODUCCIÓN CIENTÍFICA GIETRB---------------------
            String ProduccionGIETRB = request.getParameter("ProduccionGIETRB");
            String Insertar_Produccion_GIETRB = request.getParameter("Insertar_Produccion_GIETRB");
            String Guardar_Produccion_GIETRB = request.getParameter("Guardar_Produccion_GIETRB");
            String Modificar_Produccion_GIETRB = request.getParameter("Modificar_Produccion_GIETRB");
            String Buscar_Produccion_GIETRB = request.getParameter("Buscar_Produccion_GIETRB");
            String Nombre_Prod_GIETRB = request.getParameter("Nombre_Prod_GIETRB");
            String Actualizar_Prod_GIETRB = request.getParameter("Actualizar_Produccion_GIETRB");
            String Eliminar_Produccion_GIETRB = request.getParameter("Eliminar_Produccion_GIETRB");
            String Buscar_Eliminar_GIETRB = request.getParameter("Buscar_Eliminar_GIETRB");
            String Eliminar_Prod_GIETRB = request.getParameter("Eliminar_Prod_GIETRB");

            if (ProduccionGIETRB != null) {

                Vector v = Consultar_Produccion.ListarProduccionGIETRB();
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Produccion_GIETRB_Admin.jsp").forward(request, response);

            }
            if (Insertar_Produccion_GIETRB != null) {

                request.getRequestDispatcher("/JSP/Insertar_Produccion_GIETRB_Admin.jsp").forward(request, response);

            }
            if (Guardar_Produccion_GIETRB != null) {

                String Autores_Produccion_GIETRB = request.getParameter("Autores_Produccion_GIETRB");
                String Grupo_Produccion_GIETRB = request.getParameter("Grupo_Produccion_GIETRB");
                String Titulo_Produccion_GIETRB = request.getParameter("Titulo_Produccion_GIETRB");
                String Revista_Produccion_GIETRB = request.getParameter("Revista_Produccion_GIETRB");
                String Tipo_Produccion_GIETRB = request.getParameter("Tipo_Produccion_GIETRB");
                String Año_Produccion_GIETRB = request.getParameter("Ano_Produccion_GIETRB");
                String Url_Produccion_GIETRB = request.getParameter("Url_Produccion_GIETRB");

                if (Insertar_Produccion_GIETRB_Admin.ProduccionGIETRB(new Insertar_Produccion_GIETRB_Admin(Autores_Produccion_GIETRB, Grupo_Produccion_GIETRB, Titulo_Produccion_GIETRB, Revista_Produccion_GIETRB, Tipo_Produccion_GIETRB, Año_Produccion_GIETRB, Url_Produccion_GIETRB))) {
                    request.getRequestDispatcher("/JSP/Insertar_Produccion_GIETRB_Admin.jsp").forward(request, response);
                }
            }
            if (Modificar_Produccion_GIETRB != null) {
                request.getRequestDispatcher("/JSP/Buscar_Produccion_GIETRB_Admin.jsp").forward(request, response);
            }
            if (Buscar_Produccion_GIETRB != null) {
                Vector v = Buscar_Produccion.BuscarGIETRB(Nombre_Prod_GIETRB);
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Buscar_Produccion_GIETRB_Admin2.jsp").forward(request, response);
            }
            if (Actualizar_Prod_GIETRB != null) {
                String ID_Produccion_GIETRB = request.getParameter("ID_Produccion_GIETRB");
                String Autores_Produccion_GIETRB = request.getParameter("Autores_Produccion_GIETRB");
                String Grupo_Produccion_GIETRB = request.getParameter("Grupo_Produccion_GIETRB");
                String Titulo_Produccion_GIETRB = request.getParameter("Titulo_Produccion_GIETRB");
                String Revista_Produccion_GIETRB = request.getParameter("Revista_Produccion_GIETRB");
                String Tipo_Produccion_GIETRB = request.getParameter("Tipo_Produccion_GIETRB");
                String Año_Produccion_GIETRB = request.getParameter("Ano_Produccion_GIETRB");
                String Url_Produccion_GIETRB = request.getParameter("Url_Produccion_GIETRB");

                if (Actualizar_Produccion_GIETRB.Actualizar(new Actualizar_Produccion_GIETRB(ID_Produccion_GIETRB, Autores_Produccion_GIETRB, Grupo_Produccion_GIETRB, Titulo_Produccion_GIETRB, Revista_Produccion_GIETRB, Tipo_Produccion_GIETRB, Año_Produccion_GIETRB, Url_Produccion_GIETRB))) {
                    Vector v = Consultar_Produccion.ListarProduccionGIETRB();
                    request.setAttribute("Produccion", v);
                    request.getRequestDispatcher("/JSP/Produccion_GIETRB_Admin.jsp").forward(request, response);
                }
            }
            if (Eliminar_Produccion_GIETRB != null) {
                request.getRequestDispatcher("/JSP/Buscar_Eliminar_Produccion_GIETRB_Admin.jsp").forward(request, response);
            }
            if (Buscar_Eliminar_GIETRB != null) {
                Vector v = Buscar_Produccion.BuscarGIETRB(Nombre_Prod_GIETRB);
                request.setAttribute("Produccion", v);
                request.getRequestDispatcher("/JSP/Buscar_Eliminar_Produccion_GIETRB_Admin2.jsp").forward(request, response);
            }
            if (Eliminar_Prod_GIETRB != null) {
                String ID_Produccion_GIETRB = request.getParameter("ID_Produccion_GIETRB");
                String Autores_Produccion_GIETRB = request.getParameter("Autores_Produccion_GIETRB");
                String Titulo_Produccion_GIETRB = request.getParameter("Titulo_Produccion_GIETRB");

                if (Eliminar_Produccion_GIETRB_Admin.Produccion(new Eliminar_Produccion_GIETRB_Admin(ID_Produccion_GIETRB, Autores_Produccion_GIETRB, Titulo_Produccion_GIETRB))) {
                    Vector v = Consultar_Produccion.ListarProduccionGIETRB();
                    request.setAttribute("Produccion", v);
                    request.getRequestDispatcher("/JSP/Produccion_GIETRB_Admin.jsp").forward(request, response);
                }
            }
// *************HASTA AQUÍ BOTONES PRODUCCIÓN CIENTÍFICA GIETRB***************





//---------------------BOTONES PONENCIAS Y EVENTOS  GIBM---------------------
            String PonenciasGIBM = request.getParameter("PonenciasGIBM");
            String Insertar_Ponencia_GIBM = request.getParameter("Insertar_Ponencia_GIBM");
            String Guardar_Ponencia_GIBM = request.getParameter("Guardar_Ponencia_GIBM");
            String Modificar_Ponencia_GIBM = request.getParameter("Modificar_Ponencia_GIBM");
            String Buscar_Ponencia_GIBM = request.getParameter("Buscar_Ponencia_GIBM");
            String Nombre_Pon_GIBM = request.getParameter("Nombre_Pon_GIBM");
            String Actualizar_Pon_GIBM = request.getParameter("Actualizar_Ponencia_GIBM");

            if (PonenciasGIBM != null) {

                Vector v = Consultar_Ponencias.ListarPonenciasGIBM();
                request.setAttribute("Ponencias", v);
                request.getRequestDispatcher("/JSP/Ponencias_GIBM_Admin.jsp").forward(request, response);

            }
            if (Insertar_Ponencia_GIBM != null) {

                request.getRequestDispatcher("/JSP/Insertar_Ponencias_GIBM_Admin.jsp").forward(request, response);

            }
            if (Guardar_Ponencia_GIBM != null) {

                String Evento_Ponencia_GIBM = request.getParameter("Evento_Ponencia_GIBM");
                String Año_Ponencia_GIBM = request.getParameter("Ano_Ponencia_GIBM");
                String Ciudad_Ponencia_GIBM = request.getParameter("Ciudad_Ponencia_GIBM");
                String Pais_Ponencia_GIBM = request.getParameter("Pais_Ponencia_GIBM");
                String Grupo_Ponencia_GIBM = request.getParameter("Grupo_Ponencia_GIBM");

                if (Insertar_Ponencias_GIBM_Admin.PonenciasGIBM(new Insertar_Ponencias_GIBM_Admin(Evento_Ponencia_GIBM, Año_Ponencia_GIBM, Ciudad_Ponencia_GIBM, Pais_Ponencia_GIBM, Grupo_Ponencia_GIBM))) {
                    request.getRequestDispatcher("/JSP/Insertar_Ponencias_GIBM_Admin.jsp").forward(request, response);
                }

            }
            if (Modificar_Ponencia_GIBM != null) {
                request.getRequestDispatcher("/JSP/Buscar_Ponencia_GIBM_Admin.jsp").forward(request, response);
            }
            if (Buscar_Ponencia_GIBM != null) {
                Vector v = Buscar_Ponencia.BuscarGIBM(Nombre_Pon_GIBM);
                request.setAttribute("Ponencias", v);
                request.getRequestDispatcher("/JSP/Buscar_Ponencia_GIBM_Admin2.jsp").forward(request, response);
            }
            if (Actualizar_Pon_GIBM != null) {
                String ID_Ponencia_GIBM = request.getParameter("ID_Ponencia_GIBM");
                String Evento_Ponencia_GIBM = request.getParameter("Evento_Ponencia_GIBM");
                String Año_Ponencia_GIBM = request.getParameter("Ano_Ponencia_GIBM");
                String Ciudad_Ponencia_GIBM = request.getParameter("Ciudad_Ponencia_GIBM");
                String Pais_Ponencia_GIBM = request.getParameter("Pais_Ponencia_GIBM");
                String Grupo_Ponencia_GIBM = request.getParameter("Grupo_Ponencia_GIBM");


                if (Actualizar_Ponencias_GIBM.Actualizar(new Actualizar_Ponencias_GIBM(ID_Ponencia_GIBM, Evento_Ponencia_GIBM, Año_Ponencia_GIBM, Ciudad_Ponencia_GIBM, Pais_Ponencia_GIBM, Grupo_Ponencia_GIBM))) {
                    Vector v = Consultar_Ponencias.ListarPonenciasGIBM();
                    request.setAttribute("Ponencias", v);
                    request.getRequestDispatcher("/JSP/Ponencias_GIBM_Admin.jsp").forward(request, response);
                }
            }

// *************HASTA AQUÍ BOTONES PONENCIAS Y EVENTOS GIBM***************






//---------------------BOTONES PONENCIAS Y EVENTOS  GIETRB---------------------
            String PonenciasGIETRB = request.getParameter("PonenciasGIETRB");
            String Insertar_Ponencias_GIETRB = request.getParameter("Insertar_Ponencias_GIETRB");
            String Guardar_Ponencia_GIETRB = request.getParameter("Guardar_Ponencia_GIETRB");
            String Modificar_Ponencia_GIETRB = request.getParameter("Modificar_Ponencia_GIETRB");
            String Buscar_Ponencia_GIETRB = request.getParameter("Buscar_Ponencia_GIETRB");
            String Nombre_Pon_GIETRB = request.getParameter("Nombre_Pon_GIETRB");
            String Actualizar_Pon_GIETRB = request.getParameter("Actualizar_Ponencia_GIETRB");

            if (PonenciasGIETRB != null) {

                Vector v = Consultar_Ponencias.ListarPonenciasGIETRB();
                request.setAttribute("Ponencias", v);
                request.getRequestDispatcher("/JSP/Ponencias_GIETRB_Admin.jsp").forward(request, response);

            }
            if (Insertar_Ponencias_GIETRB != null) {

                request.getRequestDispatcher("/JSP/Insertar_Ponencias_GIETRB_Admin.jsp").forward(request, response);

            }
            if (Guardar_Ponencia_GIETRB != null) {

                String Evento_Ponencia_GIETRB = request.getParameter("Evento_Ponencia_GIETRB");
                String Año_Ponencia_GIETRB = request.getParameter("Ano_Ponencia_GIETRB");
                String Ciudad_Ponencia_GIETRB = request.getParameter("Ciudad_Ponencia_GIETRB");
                String Pais_Ponencia_GIETRB = request.getParameter("Pais_Ponencia_GIETRB");
                String Grupo_Ponencia_GIETRB = request.getParameter("Grupo_Ponencia_GIETRB");

                if (Insertar_Ponencias_GIETRB_Admin.PonenciasGIETRB(new Insertar_Ponencias_GIETRB_Admin(Evento_Ponencia_GIETRB, Año_Ponencia_GIETRB, Ciudad_Ponencia_GIETRB, Pais_Ponencia_GIETRB, Grupo_Ponencia_GIETRB))) {
                    request.getRequestDispatcher("/JSP/Insertar_Ponencias_GIETRB_Admin.jsp").forward(request, response);
                }

            }
            if (Modificar_Ponencia_GIETRB != null) {
                request.getRequestDispatcher("/JSP/Buscar_Ponencia_GIETRB_Admin.jsp").forward(request, response);
            }
            if (Buscar_Ponencia_GIETRB != null) {
                Vector v = Buscar_Ponencia.BuscarGIETRB(Nombre_Pon_GIETRB);
                request.setAttribute("Ponencias", v);
                request.getRequestDispatcher("/JSP/Buscar_Ponencia_GIETRB_Admin2.jsp").forward(request, response);
            }
            if (Actualizar_Pon_GIETRB != null) {
                String ID_Ponencia_GIETRB = request.getParameter("ID_Ponencia_GIETRB");
                String Evento_Ponencia_GIETRB = request.getParameter("Evento_Ponencia_GIETRB");
                String Año_Ponencia_GIETRB = request.getParameter("Ano_Ponencia_GIETRB");
                String Ciudad_Ponencia_GIETRB = request.getParameter("Ciudad_Ponencia_GIETRB");
                String Pais_Ponencia_GIETRB = request.getParameter("Pais_Ponencia_GIETRB");
                String Grupo_Ponencia_GIETRB = request.getParameter("Grupo_Ponencia_GIETRB");


                if (Actualizar_Ponencias_GIBM.Actualizar(new Actualizar_Ponencias_GIBM(ID_Ponencia_GIETRB, Evento_Ponencia_GIETRB, Año_Ponencia_GIETRB, Ciudad_Ponencia_GIETRB, Pais_Ponencia_GIETRB, Grupo_Ponencia_GIETRB))) {
                    Vector v = Consultar_Ponencias.ListarPonenciasGIETRB();
                    request.setAttribute("Ponencias", v);
                    request.getRequestDispatcher("/JSP/Ponencias_GIETRB_Admin.jsp").forward(request, response);
                }
            }
// *************HASTA AQUÍ BOTONES PONENCIAS Y EVENTOS GIETRB***************




//---------------------BOTONES PREMIOS Y DISTINCIONES  GIBM---------------------
            String PremiosGIBM = request.getParameter("PremiosGIBM");
            String Insertar_Premios_GIBM = request.getParameter("Insertar_Premios_GIBM");
            String Guardar_Premios_GIBM = request.getParameter("Guardar_Premios_GIBM");
            String Modificar_Premios_GIBM = request.getParameter("Modificar_Premios_GIBM");
            String Buscar_Premios_GIBM = request.getParameter("Buscar_Premio_GIBM");
            String Nombre_Pre_GIBM = request.getParameter("Nombre_Pre_GIBM");
            String Actualizar_Pre_GIBM = request.getParameter("Actualizar_Premios_GIBM");

            if (PremiosGIBM != null) {

                Vector v = Consultar_Premios.ListarPremiosGIBM();
                request.setAttribute("Premios", v);
                request.getRequestDispatcher("/JSP/Premios_GIBM_Admin.jsp").forward(request, response);

            }
            if (Insertar_Premios_GIBM != null) {
                request.getRequestDispatcher("/JSP/Insertar_Premios_GIBM_Admin.jsp").forward(request, response);
            }

            if (Guardar_Premios_GIBM != null) {

                String Evento_Premios_GIBM = request.getParameter("Evento_Premios_GIBM");
                String Premios_Premios_GIBM = request.getParameter("Premios_Premios_GIBM");
                String Trabajo_Premios_GIBM = request.getParameter("Trabajo_Premios_GIBM");
                String Categoria_Premios_GIBM = request.getParameter("Categoria_Premios_GIBM");
                String Grupo_Premios_GIBM = request.getParameter("Grupo_Premios_GIBM");

                if (Insertar_Premios_GIBM_Admin.PremiosGIBM(new Insertar_Premios_GIBM_Admin(Evento_Premios_GIBM, Premios_Premios_GIBM, Trabajo_Premios_GIBM, Categoria_Premios_GIBM, Grupo_Premios_GIBM))) {
                    request.getRequestDispatcher("/JSP/Insertar_Premios_GIBM_Admin.jsp").forward(request, response);
                }

            }

            if (Modificar_Premios_GIBM != null) {
                request.getRequestDispatcher("/JSP/Buscar_Premios_GIBM_Admin.jsp").forward(request, response);
            }
            if (Buscar_Premios_GIBM != null) {
                Vector v = Buscar_Premios.BuscarGIBM(Nombre_Pre_GIBM);
                request.setAttribute("Premios", v);
                request.getRequestDispatcher("/JSP/Buscar_Premios_GIBM_Admin2.jsp").forward(request, response);
            }
            if (Actualizar_Pre_GIBM != null) {
                String ID_Premios_GIBM = request.getParameter("ID_Premios_GIBM");
                String Evento_Premios_GIBM = request.getParameter("Evento_Premios_GIBM");
                String Premios_Premios_GIBM = request.getParameter("Premios_Premios_GIBM");
                String Trabajo_Premios_GIBM = request.getParameter("Trabajo_Premios_GIBM");
                String Categoria_Premios_GIBM = request.getParameter("Categoria_Premios_GIBM");
                String Grupo_Premios_GIBM = request.getParameter("Grupo_Premios_GIBM");


                if (Actualizar_Premios_GIBM.Actualizar(new Actualizar_Premios_GIBM(ID_Premios_GIBM, Evento_Premios_GIBM, Premios_Premios_GIBM, Trabajo_Premios_GIBM, Categoria_Premios_GIBM, Grupo_Premios_GIBM))) {
                    Vector v = Consultar_Premios.ListarPremiosGIBM();
                    request.setAttribute("Premios", v);
                    request.getRequestDispatcher("/JSP/Premios_GIBM_Admin.jsp").forward(request, response);
                }
            }
// *************HASTA AQUÍ BOTONES PREMIOS Y DISTINCIONES GIBM***************





//---------------------BOTONES PREMIOS Y DISTINCIONES  GIETRB---------------------

            String PremiosGIETRB = request.getParameter("PremiosGIETRB");
            String Insertar_Premios_GIETRB = request.getParameter("Insertar_Premios_GIETRB");
            String Guardar_Premios_GIETRB = request.getParameter("Guardar_Premios_GIETRB");
            String Modificar_Premios_GIETRB = request.getParameter("Modificar_Premios_GIETRB");
            String Buscar_Premios_GIETRB = request.getParameter("Buscar_Premio_GIETRB");
            String Nombre_Pre_GIETRB = request.getParameter("Nombre_Pre_GIETRB");
            String Actualizar_Pre_GIETRB = request.getParameter("Actualizar_Premios_GIETRB");

            if (PremiosGIETRB != null) {

                Vector v = Consultar_Premios.ListarPremiosGIETRB();
                request.setAttribute("Premios", v);
                request.getRequestDispatcher("/JSP/Premios_GIETRB_Admin.jsp").forward(request, response);

            }
            if (Insertar_Premios_GIETRB != null) {
                request.getRequestDispatcher("/JSP/Insertar_Premios_GIETRB_Admin.jsp").forward(request, response);
            }
            if (Guardar_Premios_GIETRB != null) {

                String Evento_Premios_GIETRB = request.getParameter("Evento_Premios_GIETRB");
                String Premios_Premios_GIETRB = request.getParameter("Premios_Premios_GIETRB");
                String Trabajo_Premios_GIETRB = request.getParameter("Trabajo_Premios_GIETRB");
                String Categoria_Premios_GIETRB = request.getParameter("Categoria_Premios_GIETRB");
                String Grupo_Premios_GIETRB = request.getParameter("Grupo_Premios_GIETRB");

                if (Insertar_Premios_GIETRB_Admin.PremiosGIETRB(new Insertar_Premios_GIETRB_Admin(Evento_Premios_GIETRB, Premios_Premios_GIETRB, Trabajo_Premios_GIETRB, Categoria_Premios_GIETRB, Grupo_Premios_GIETRB))) {
                    request.getRequestDispatcher("/JSP/Insertar_Premios_GIETRB_Admin.jsp").forward(request, response);
                }

            }
            if (Modificar_Premios_GIETRB != null) {
                request.getRequestDispatcher("/JSP/Buscar_Premios_GIETRB_Admin.jsp").forward(request, response);
            }
            if (Buscar_Premios_GIETRB != null) {
                Vector v = Buscar_Premios.BuscarGIETRB(Nombre_Pre_GIETRB);
                request.setAttribute("Premios", v);
                request.getRequestDispatcher("/JSP/Buscar_Premios_GIETRB_Admin2.jsp").forward(request, response);
            }

            if (Actualizar_Pre_GIETRB != null) {
                String ID_Premios_GIETRB = request.getParameter("ID_Premios_GIETRB");
                String Evento_Premios_GIETRB = request.getParameter("Evento_Premios_GIETRB");
                String Premios_Premios_GIETRB = request.getParameter("Premios_Premios_GIETRB");
                String Trabajo_Premios_GIETRB = request.getParameter("Trabajo_Premios_GIETRB");
                String Categoria_Premios_GIETRB = request.getParameter("Categoria_Premios_GIETRB");
                String Grupo_Premios_GIETRB = request.getParameter("Grupo_Premios_GIETRB");


                if (Actualizar_Premios_GIETRB.Actualizar(new Actualizar_Premios_GIETRB(ID_Premios_GIETRB, Evento_Premios_GIETRB, Premios_Premios_GIETRB, Trabajo_Premios_GIETRB, Categoria_Premios_GIETRB, Grupo_Premios_GIETRB))) {
                    Vector v = Consultar_Premios.ListarPremiosGIETRB();
                    request.setAttribute("Premios", v);
                    request.getRequestDispatcher("/JSP/Premios_GIETRB_Admin.jsp").forward(request, response);
                }
            }
// *************HASTA AQUÍ BOTONES PREMIOS Y DISTINCIONES GIETRB***************







//---------------------BOTON INICIO MENÚ PROYECTOS---------------------
            String Inicio = request.getParameter("Inicio");
            if (Inicio != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Admin.jsp").forward(request, response);
            }

            String Contacto = request.getParameter("Contacto");
            if (Contacto != null) {
                request.getRequestDispatcher("/JSP/Contacto.jsp").forward(request, response);
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

                request.getRequestDispatcher("/JSP/Proyectos_Admin.jsp").forward(request, response);

            }

            if (VerNoticias != null) {
                Vector v = Consultar_Noticias.ListarNoticias();
                request.setAttribute("Noticias", v);
                request.getRequestDispatcher("/JSP/Noticias_Admin.jsp").forward(request, response);

            }

            if (NuevaNoticia != null) {

                request.getRequestDispatcher("/JSP/Nueva_Noticia_Admin.jsp").forward(request, response);

            }

            if (Guardar_Noticia != null) {

                String Fecha_Noticia = request.getParameter("Fecha_Noticia");
                String Titulo_Noticia = request.getParameter("Titulo_Noticia");
                String Codigo_Noticia = request.getParameter("Codigo_Noticia");
                String Cuerpo_Noticia = request.getParameter("Cuerpo_Noticia");
                String Imagen_Noticia = request.getParameter("Imagen_Noticia");

                SimpleDateFormat formateador = new SimpleDateFormat(
                        "dd 'de' MMMM 'de' yyyy", new Locale("es"));
                Date fechaDate = new Date();
                String Fecha_Español = formateador.format(fechaDate);

                if (Insertar_Noticias_Admin.Noticias(new Insertar_Noticias_Admin(Fecha_Noticia, Titulo_Noticia, Codigo_Noticia, Cuerpo_Noticia, Fecha_Español, Imagen_Noticia))) {
                    request.getRequestDispatcher("/JSP/Nueva_Noticia_Admin.jsp").forward(request, response);
                }
            }
            if (EditarNoticia != null) {
                request.getRequestDispatcher("/JSP/Buscar_Noticias_Admin.jsp").forward(request, response);
            }

            if (Buscar_Noticia != null) {
                Vector v = Buscar_Noticias.Buscar(Nombre_Noticias);
                request.setAttribute("Noticias", v);
                request.getRequestDispatcher("/JSP/Buscar_Noticias_Admin2.jsp").forward(request, response);
            }
            if (Editar_Noticia != null) {
                String ID_Noticia = request.getParameter("ID_Noticia");
                String Fecha_Noticia = request.getParameter("Fecha_Noticia");
                String Titulo_Noticia = request.getParameter("Titulo_Noticia");
                String Codigo_Noticia = request.getParameter("Codigo_Noticia");
                String Cuerpo_Noticia = request.getParameter("Cuerpo_Noticia");
                String Imagen_Noticia = request.getParameter("Imagen_Noticia");

                if (Actualizar_Noticia_Admin.Noticias(new Actualizar_Noticia_Admin(ID_Noticia, Fecha_Noticia, Titulo_Noticia, Codigo_Noticia, Cuerpo_Noticia))) {
                    Vector v = Consultar_Noticias.ListarNoticias();
                    request.setAttribute("Noticias", v);
                    request.getRequestDispatcher("/JSP/Noticias_Admin.jsp").forward(request, response);
                }
            }

            if (EliminarNoticia != null) {
                request.getRequestDispatcher("/JSP/Buscar_Noticias_Eliminar_Admin.jsp").forward(request, response);
            }
            if (Buscar_Eliminar != null) {
                Vector v = Buscar_Noticias.Buscar(Nombre_Noticias);
                request.setAttribute("Noticias", v);
                request.getRequestDispatcher("/JSP/Buscar_Noticias_Eliminar_Admin2.jsp").forward(request, response);
            }
            if (Eliminar_Noticia != null) {
                String ID_Noticia = request.getParameter("ID_Noticia");
                String Titulo_Noticia = request.getParameter("Titulo_Noticia");

                if (Eliminar_Noticia_Admin.Noticias(new Eliminar_Noticia_Admin(ID_Noticia, Titulo_Noticia))) {
                    Vector v = Consultar_Noticias.ListarNoticias();
                    request.setAttribute("Noticias", v);
                    request.getRequestDispatcher("/JSP/Noticias_Admin.jsp").forward(request, response);
                }
            }
//************************HASTA AQUÍ BOTONES NOTICIAS**********************





//---------------------BOTONES GRUPOS---------------------
            String Grupos = request.getParameter("Grupos");

            String GIBM = request.getParameter("GIBM");
            String GIETRB = request.getParameter("GIETRB");

            if (Grupos != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Admin.jsp").forward(request, response);
            }

            if (GIBM != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Admin.jsp").forward(request, response);
            }
            if (GIETRB != null) {
                request.getRequestDispatcher("/JSP/Proyectos_Admin.jsp").forward(request, response);
            }
// *************HASTA AQUÍ BOTONES GRUPOS***************


        } catch (Exception e) {
            request.setAttribute("msg", e.getMessage());
            request.setAttribute("target", "/Sisphel_Web/JSP/Proyectos_Admin.jsp");
            request.getRequestDispatcher("ServletError").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
