package Operaciones;

import java.util.*;
import java.sql.*;

public class Actualizar_Ponencias_GIETRB {

    private String ID_Ponencia_GIETRB;
    private String Evento_Ponencia_GIETRB;
    private String Año_Ponencia_GIETRB;
    private String Ciudad_Ponencia_GIETRB;
    private String Pais_Ponencia_GIETRB;
    private String Grupo_Ponencia_GIETRB;

    public Actualizar_Ponencias_GIETRB(String ID_Ponencia_GIETRB, String Evento_Ponencia_GIETRB, String Año_Ponencia_GIETRB, String Ciudad_Ponencia_GIETRB, String Pais_Ponencia_GIETRB, String Grupo_Ponencia_GIETRB) {
        this.ID_Ponencia_GIETRB = ID_Ponencia_GIETRB;
        this.Evento_Ponencia_GIETRB = Evento_Ponencia_GIETRB.toUpperCase();
        this.Año_Ponencia_GIETRB = Año_Ponencia_GIETRB.toUpperCase();
        this.Ciudad_Ponencia_GIETRB = Ciudad_Ponencia_GIETRB.toUpperCase();
        this.Pais_Ponencia_GIETRB = Pais_Ponencia_GIETRB.toUpperCase();
        this.Grupo_Ponencia_GIETRB = Grupo_Ponencia_GIETRB.toUpperCase();

    }

    public static synchronized boolean Actualizar(Actualizar_Ponencias_GIETRB p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("UPDATE ponencias set Evento=?,Year=?,Ciudad=?,Pais=?,Grupo=? WHERE ID=?");

        st.setString(1, p.getEvento_Ponencia_GIETRB());
        st.setString(2, p.getAño_Ponencia_GIETRB());
        st.setString(3, p.getCiudad_Ponencia_GIETRB());
        st.setString(4, p.getPais_Ponencia_GIETRB());
        st.setString(5, p.getGrupo_Ponencia_GIETRB());
        st.setString(6, p.getID_Ponencia_GIETRB());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public String getID_Ponencia_GIETRB() {
        return ID_Ponencia_GIETRB;
    }

    public void setID_Ponencia_GIETRB(String ID_Ponencia_GIETRB) {
        this.ID_Ponencia_GIETRB = ID_Ponencia_GIETRB;
    }

    public String getEvento_Ponencia_GIETRB() {
        return Evento_Ponencia_GIETRB;
    }

    public void setEvento_Ponencia_GIETRB(String Evento_Ponencia_GIETRB) {
        this.Evento_Ponencia_GIETRB = Evento_Ponencia_GIETRB;
    }

    public String getAño_Ponencia_GIETRB() {
        return Año_Ponencia_GIETRB;
    }

    public void setAño_Ponencia_GIETRB(String Año_Ponencia_GIETRB) {
        this.Año_Ponencia_GIETRB = Año_Ponencia_GIETRB;
    }

    public String getCiudad_Ponencia_GIETRB() {
        return Ciudad_Ponencia_GIETRB;
    }

    public void setCiudad_Ponencia_GIETRB(String Ciudad_Ponencia_GIETRB) {
        this.Ciudad_Ponencia_GIETRB = Ciudad_Ponencia_GIETRB;
    }

    public String getPais_Ponencia_GIETRB() {
        return Pais_Ponencia_GIETRB;
    }

    public void setPais_Ponencia_GIETRB(String Pais_Ponencia_GIETRB) {
        this.Pais_Ponencia_GIETRB = Pais_Ponencia_GIETRB;
    }

    public String getGrupo_Ponencia_GIETRB() {
        return Grupo_Ponencia_GIETRB;
    }

    public void setGrupo_Ponencia_GIETRB(String Grupo_Ponencia_GIETRB) {
        this.Grupo_Ponencia_GIETRB = Grupo_Ponencia_GIETRB;
    }
}
