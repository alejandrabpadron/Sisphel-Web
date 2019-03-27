package Operaciones;

import java.sql.*;
import java.util.Vector;

public class Buscar_Produccion {

    private String ID;
    private String Autores;
    private String Nombre_Prod_GIBM;
    private String Revista;
    private String Tipo;
    private String Año;
    private String Url;
    private String Nombre_Prod_GIETRB;
    private String Grupo;

    public Buscar_Produccion(String ID, String Autores, String Nombre_Prod_GIBM, String Revista, String Tipo, String Año, String Url) {
        this.ID = ID;
        this.Autores = Autores.toUpperCase();
        this.Nombre_Prod_GIBM = Nombre_Prod_GIBM.toUpperCase();
        this.Revista = Revista.toUpperCase();
        this.Tipo = Tipo.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Url = Url.toUpperCase();
    }

    public static synchronized Vector BuscarGIBM(String Nombre_Prod_GIBM) throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Autores, Titulo,Journal_Revista,Tipo, Year, URL FROM produccion_cientifica WHERE Grupo='01' AND Titulo LIKE ?");

        st.setString(1, "%" + Nombre_Prod_GIBM + "%");
        ResultSet rs = st.executeQuery();

        Proyectos = new Vector();

        while (rs.next()) {
            Proyectos.add(new Buscar_Produccion(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
        }


        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public Buscar_Produccion(String ID, String Autores, String Grupo, String Nombre_Prod_GIBM, String Revista, String Tipo, String Año, String Url) {
        this.ID = ID;
        this.Autores = Autores.toUpperCase();
        this.Grupo = Grupo.toUpperCase();
        this.Nombre_Prod_GIBM = Nombre_Prod_GIBM.toUpperCase();
        this.Revista = Revista.toUpperCase();
        this.Tipo = Tipo.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Url = Url.toUpperCase();
    }

    public static synchronized Vector BuscarGIETRB(String Nombre_Prod_GIETRB) throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Autores,Grupo, Titulo,Journal_Revista,Tipo, Year, URL FROM produccion_cientifica WHERE Grupo='02' AND Titulo LIKE ?");

        st.setString(1, "%" + Nombre_Prod_GIETRB + "%");
        ResultSet rs = st.executeQuery();

        Proyectos = new Vector();

        while (rs.next()) {
            Proyectos.add(new Buscar_Produccion(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8)));
        }


        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String Autores) {
        this.Autores = Autores;
    }

    public String getNombre_Prod_GIBM() {
        return Nombre_Prod_GIBM;
    }

    public void setNombre_Prod_GIBM(String Nombre_Prod_GIBM) {
        this.Nombre_Prod_GIBM = Nombre_Prod_GIBM;
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

    public String getNombre_Prod_GIETRB() {
        return Nombre_Prod_GIETRB;
    }

    public void setNombre_Prod_GIETRB(String Nombre_Prod_GIETRB) {
        this.Nombre_Prod_GIETRB = Nombre_Prod_GIETRB;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }
}
