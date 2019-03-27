package Operaciones;

import java.sql.*;
import java.util.Vector;

public class Buscar_Premios {

    private String ID;
    private String Evento;
    private String Nombre_Pre_GIBM;
    private String Trabajo;
    private String Categoria;
    private String Grupo;
    private String Nombre_Pre_GIETRB;

    public Buscar_Premios(String ID, String Evento, String Nombre_Pre_GIBM, String Trabajo, String Categoria) {
        this.ID = ID;
        this.Evento = Evento.toUpperCase();
        this.Nombre_Pre_GIBM = Nombre_Pre_GIBM.toUpperCase();
        this.Trabajo = Trabajo.toUpperCase();
        this.Categoria = Categoria.toUpperCase();
    }

    public static synchronized Vector BuscarGIBM(String Nombre_Pre_GIBM) throws SQLException {
        Vector Premios = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Evento, Premio,Trabajo,Categoria FROM premios WHERE Grupo='01' AND Premio LIKE ?");

        st.setString(1, "%" + Nombre_Pre_GIBM + "%");
        ResultSet rs = st.executeQuery();

        Premios = new Vector();

        while (rs.next()) {
            Premios.add(new Buscar_Premios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }


        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Premios;

    }

    public Buscar_Premios(String ID, String Evento, String Nombre_Pre_GIETRB, String Trabajo, String Categoria, String Grupo) {
        this.ID = ID;
        this.Evento = Evento.toUpperCase();
        this.Nombre_Pre_GIETRB = Nombre_Pre_GIETRB.toUpperCase();
        this.Trabajo = Trabajo.toUpperCase();
        this.Categoria = Categoria.toUpperCase();
        this.Grupo = Grupo.toUpperCase();

    }

    public static synchronized Vector BuscarGIETRB(String Nombre_Pre_GIETRB) throws SQLException {
        Vector Premios = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Evento, Premio,Trabajo,Categoria,Grupo FROM premios WHERE Grupo='02' AND Premio LIKE ?");

        st.setString(1, "%" + Nombre_Pre_GIETRB + "%");
        ResultSet rs = st.executeQuery();

        Premios = new Vector();

        while (rs.next()) {
            Premios.add(new Buscar_Premios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }


        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Premios;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEvento() {
        return Evento;
    }

    public void setEvento(String Evento) {
        this.Evento = Evento;
    }

    public String getNombre_Pre_GIBM() {
        return Nombre_Pre_GIBM;
    }

    public void setNombre_Pre_GIBM(String Nombre_Pre_GIBM) {
        this.Nombre_Pre_GIBM = Nombre_Pre_GIBM;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getNombre_Pre_GIETRB() {
        return Nombre_Pre_GIETRB;
    }

    public void setNombre_Pre_GIETRB(String Nombre_Pre_GIETRB) {
        this.Nombre_Pre_GIETRB = Nombre_Pre_GIETRB;
    }

}
