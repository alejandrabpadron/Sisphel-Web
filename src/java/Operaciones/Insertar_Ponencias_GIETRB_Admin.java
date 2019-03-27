package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Ponencias_GIETRB_Admin {

    private String Evento_Ponencia_GIETRB;
    private String Año_Ponencia_GIETRB;
    private String Ciudad_Ponencia_GIETRB;
    private String Pais_Ponencia_GIETRB;
    private String Grupo_Ponencia_GIETRB;

    public static synchronized boolean PonenciasGIETRB(Insertar_Ponencias_GIETRB_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO ponencias(Evento,Year,Ciudad,Pais,Grupo) VALUES (?,?,?,?,?)");
        st.setString(1, p.getEvento_Ponencia_GIETRB());
        st.setString(2, p.getAño_Ponencia_GIETRB());
        st.setString(3, p.getCiudad_Ponencia_GIETRB());
        st.setString(4, p.getPais_Ponencia_GIETRB());
        st.setString(5, p.getGrupo_Ponencia_GIETRB());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Ponencias_GIETRB_Admin(String Evento_Ponencia_GIETRB, String Año_Ponencia_GIETRB, String Ciudad_Ponencia_GIETRB, String Pais_Ponencia_GIETRB, String Grupo_Ponencia_GIETRB) {
        this.Evento_Ponencia_GIETRB = Evento_Ponencia_GIETRB.toUpperCase();
        this.Año_Ponencia_GIETRB = Año_Ponencia_GIETRB.toUpperCase();
        this.Ciudad_Ponencia_GIETRB = Ciudad_Ponencia_GIETRB.toUpperCase();
        this.Pais_Ponencia_GIETRB = Pais_Ponencia_GIETRB.toUpperCase();
        this.Grupo_Ponencia_GIETRB = Grupo_Ponencia_GIETRB.toUpperCase();

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
