package Operaciones;

import java.util.*;
import java.sql.*;

public class Actualizar_Ponencias_GIBM {

    private String ID_Ponencia_GIBM;
    private String Evento_Ponencia_GIBM;
    private String Año_Ponencia_GIBM;
    private String Ciudad_Ponencia_GIBM;
    private String Pais_Ponencia_GIBM;
    private String Grupo_Ponencia_GIBM;

    public Actualizar_Ponencias_GIBM(String ID_Ponencia_GIBM, String Evento_Ponencia_GIBM,String Año_Ponencia_GIBM, String Ciudad_Ponencia_GIBM, String Pais_Ponencia_GIBM, String Grupo_Ponencia_GIBM) {
        this.ID_Ponencia_GIBM = ID_Ponencia_GIBM;
        this.Evento_Ponencia_GIBM = Evento_Ponencia_GIBM.toUpperCase();
        this.Año_Ponencia_GIBM = Año_Ponencia_GIBM.toUpperCase();
        this.Ciudad_Ponencia_GIBM = Ciudad_Ponencia_GIBM.toUpperCase();
        this.Pais_Ponencia_GIBM = Pais_Ponencia_GIBM.toUpperCase();
        this.Grupo_Ponencia_GIBM = Grupo_Ponencia_GIBM.toUpperCase();

    }

    public static synchronized boolean Actualizar(Actualizar_Ponencias_GIBM p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("UPDATE ponencias set Evento=?,Year=?,Ciudad=?,Pais=?,Grupo=? WHERE ID=?");

        st.setString(1, p.getEvento_Ponencia_GIBM());
        st.setString(2, p.getAño_Ponencia_GIBM());
        st.setString(3, p.getCiudad_Ponencia_GIBM());
        st.setString(4, p.getPais_Ponencia_GIBM());
        st.setString(5, p.getGrupo_Ponencia_GIBM());
        st.setString(6, p.getID_Ponencia_GIBM());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public String getID_Ponencia_GIBM() {
        return ID_Ponencia_GIBM;
    }

    public void setID_Ponencia_GIBM(String ID_Ponencia_GIBM) {
        this.ID_Ponencia_GIBM = ID_Ponencia_GIBM;
    }

    public String getEvento_Ponencia_GIBM() {
        return Evento_Ponencia_GIBM;
    }

    public void setEvento_Ponencia_GIBM(String Evento_Ponencia_GIBM) {
        this.Evento_Ponencia_GIBM = Evento_Ponencia_GIBM;
    }

    public String getAño_Ponencia_GIBM() {
        return Año_Ponencia_GIBM;
    }

    public void setAño_Ponencia_GIBM(String Año_Ponencia_GIBM) {
        this.Año_Ponencia_GIBM = Año_Ponencia_GIBM;
    }

    public String getCiudad_Ponencia_GIBM() {
        return Ciudad_Ponencia_GIBM;
    }

    public void setCiudad_Ponencia_GIBM(String Ciudad_Ponencia_GIBM) {
        this.Ciudad_Ponencia_GIBM = Ciudad_Ponencia_GIBM;
    }

    public String getPais_Ponencia_GIBM() {
        return Pais_Ponencia_GIBM;
    }

    public void setPais_Ponencia_GIBM(String Pais_Ponencia_GIBM) {
        this.Pais_Ponencia_GIBM = Pais_Ponencia_GIBM;
    }

    public String getGrupo_Ponencia_GIBM() {
        return Grupo_Ponencia_GIBM;
    }

    public void setGrupo_Ponencia_GIBM(String Grupo_Ponencia_GIBM) {
        this.Grupo_Ponencia_GIBM = Grupo_Ponencia_GIBM;
    }

}
