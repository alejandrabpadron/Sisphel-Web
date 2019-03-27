package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Consultar_Ponencias {

    private String ID;
    private String Evento;
    private String Año;
    private String Ciudad;
    private String Pais;

    public static synchronized Vector ListarPonenciasGIBM() throws SQLException {
        Vector Ponencias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT Evento, Year,Ciudad,Pais FROM ponencias WHERE Grupo='01' ORDER BY Year DESC");
        ResultSet rs = st.executeQuery();
        Ponencias = new Vector();

        while (rs.next()) {

            Ponencias.add(new Consultar_Ponencias(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Ponencias;

    }

    public Consultar_Ponencias(String Evento, String Año, String Ciudad, String Pais) {
        this.Evento = Evento.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Ciudad = Ciudad.toUpperCase();
        this.Pais = Pais.toUpperCase();

    }
    public static synchronized Vector ListarPonenciasGIETRB() throws SQLException {
        Vector Ponencias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID,Evento, Year,Ciudad,Pais FROM ponencias WHERE Grupo='02' ORDER BY Year DESC");
        ResultSet rs = st.executeQuery();
        Ponencias = new Vector();

        while (rs.next()) {

            Ponencias.add(new Consultar_Ponencias(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Ponencias;

    }

    public Consultar_Ponencias(String ID,String Evento, String Año, String Ciudad, String Pais) {
        this.ID = ID.trim();
        this.Evento = Evento.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Ciudad = Ciudad.toUpperCase();
        this.Pais = Pais.toUpperCase();

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
   
  
}
