package Operaciones;

import java.sql.*;
import java.util.Vector;

public class Buscar_Ponencia {

    private String ID;
    private String Nombre_Pon_GIBM;
    private String Año;
    private String Ciudad;
    private String Pais;
    private String Grupo;
    private String Nombre_Pon_GIETRB;

    public Buscar_Ponencia(String ID, String Nombre_Pon_GIBM, String Año, String Ciudad, String Pais) {
        this.ID = ID;
        this.Nombre_Pon_GIBM = Nombre_Pon_GIBM.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Ciudad = Ciudad.toUpperCase();
        this.Pais = Pais.toUpperCase();
    }

    public static synchronized Vector BuscarGIBM(String Nombre_Pon_GIBM) throws SQLException {
        Vector Ponencias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Evento, Year,Ciudad, Pais FROM ponencias WHERE Grupo='01' AND Evento LIKE ?");

        st.setString(1, "%" + Nombre_Pon_GIBM + "%");
        ResultSet rs = st.executeQuery();

        Ponencias = new Vector();

        while (rs.next()) {
            Ponencias.add(new Buscar_Ponencia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }

        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Ponencias;

    }

    public Buscar_Ponencia(String ID, String Nombre_Pon_GIETRB, String Año, String Ciudad, String Pais, String Grupo) {
        this.ID = ID;
        this.Nombre_Pon_GIETRB = Nombre_Pon_GIETRB.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Ciudad = Ciudad.toUpperCase();
        this.Pais = Pais.toUpperCase();
        this.Grupo = Grupo.toUpperCase();
    }

    public static synchronized Vector BuscarGIETRB(String Nombre_Pon_GIETRB) throws SQLException {
        Vector Ponencias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Evento, Year,Ciudad, Pais, Grupo FROM ponencias WHERE Grupo='02' AND Evento LIKE ?");

        st.setString(1, "%" + Nombre_Pon_GIETRB + "%");
        ResultSet rs = st.executeQuery();

        Ponencias = new Vector();

        while (rs.next()) {
            Ponencias.add(new Buscar_Ponencia(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }

        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Ponencias;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre_Pon_GIBM() {
        return Nombre_Pon_GIBM;
    }

    public void setNombre_Pon_GIBM(String Nombre_Pon_GIBM) {
        this.Nombre_Pon_GIBM = Nombre_Pon_GIBM;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getNombre_Pon_GIETRB() {
        return Nombre_Pon_GIETRB;
    }

    public void setNombre_Pon_GIETRB(String Nombre_Pon_GIETRB) {
        this.Nombre_Pon_GIETRB = Nombre_Pon_GIETRB;
    }

}
