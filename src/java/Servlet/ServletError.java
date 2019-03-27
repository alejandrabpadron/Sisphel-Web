package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletError extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void destroy() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();

        String msg = (String) request.getAttribute("msg");
        String target = (String) request.getAttribute("target");

        //* Construye la pÃ¡gina de error que se muestra en la aplicaciÃ³n
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Menú de Ventas</title>");
        out.println(" <link rel=\"icon\" type=\"image/png\" href=\"Imagenes/Logo.png\"/>");
        out.println("<style type=\"text/css\">");
        out.println(".obj {font-family: 'MS Gothic'; font-size: 50px; color: #666666; }");
        out.println(".obj2 {font-family: 'MS Gothic'; font-size: 30px; color: #000000; }");
        out.println("</style>");
        out.println("<body>");
        out.println("<p align=\"right\" ><img src=\"Imagenes/Logo.png\" width=\"300\"/></p>");
        out.println("<center><div class=\"obj\">");
        out.println("<img src=\"Imagenes/Error.png\" width=\"128\"/>");
        out.println("Se ha producido un error</div></center>");
        out.println("<br><br><br>");
        out.println("<center><div class=\"obj2\">");
        out.println(msg);
        out.println("<br><br>");
        out.println("<A href=\"" + target + "\">");
        out.println("<h3 align=\"center\"> Regresar</h3></div></center>");
        out.println("</A>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
        out.println("<h5 align=\"center\">");
        out.println("");
        out.println("</H5>");
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();

        String msg = (String) request.getAttribute("msg");
        String target = (String) request.getAttribute("target");

        //* output your page here
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 align=\"center\">");
        out.println("OperaciÃ³n desconocida");
        out.println("</H1>");
        out.println("<h2 align=\"center\">");
        out.println("Esta componente no se puede llamar aisladamente");
        out.println("</H2>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public String getServletInfo() {
        return "Short description";
    }
}
