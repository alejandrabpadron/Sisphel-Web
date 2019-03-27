package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Consultar_Produccion {

    private String ID;
    private String Autores;
    private String Titulo;
    private String Revista;
    private String Tipo;
    private String Año;
    private String Url;

    public static synchronized Vector ListarProduccionGIBM() throws SQLException {
        Vector Produccion = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT Autores, Titulo,Journal_Revista,Tipo, Year, URL FROM produccion_cientifica WHERE Grupo='01' ORDER BY Year DESC");
        ResultSet rs = st.executeQuery();
        Produccion = new Vector();

        while (rs.next()) {

            Produccion.add(new Consultar_Produccion(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Produccion;

    }

    public Consultar_Produccion(String Autores, String Titulo, String Revista, String Tipo, String Año, String Url) {
        this.Autores = Autores.toUpperCase();
        this.Titulo = Titulo.toUpperCase();
        this.Revista = Revista.toUpperCase();
        this.Tipo = Tipo.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Url = Url.toUpperCase();

    }

    public static synchronized Vector ListarProduccionGIETRB() throws SQLException {
        Vector Produccion = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID,Autores, Titulo,Journal_Revista,Tipo, Year, URL FROM produccion_cientifica WHERE Grupo='02' ORDER BY Year DESC");
        ResultSet rs = st.executeQuery();
        Produccion = new Vector();

        while (rs.next()) {

            Produccion.add(new Consultar_Produccion(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Produccion;

    }

    public Consultar_Produccion(String ID,String Autores, String Titulo, String Revista, String Tipo, String Año, String Url) {
        this.ID = ID.trim();
        this.Autores = Autores.toUpperCase();
        this.Titulo = Titulo.toUpperCase();
        this.Revista = Revista.toUpperCase();
        this.Tipo = Tipo.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Url = Url.toUpperCase();


    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String Autores) {
        this.Autores = Autores;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getRevista() {
        return Revista;
    }

    public void setRevista(String Revista) {
        this.Revista = Revista;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

  
}
