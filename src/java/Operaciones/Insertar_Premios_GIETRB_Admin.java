package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Premios_GIETRB_Admin {

    private String Evento_Premios_GIETRB;
    private String Premios_Premios_GIETRB;
    private String Trabajo_Premios_GIETRB;
    private String Categoria_Premios_GIETRB;
    private String Grupo_Premios_GIETRB;

    public static synchronized boolean PremiosGIETRB(Insertar_Premios_GIETRB_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO premios(Evento,Premio,Trabajo,Categoria,Grupo) VALUES (?,?,?,?,?)");
        st.setString(1, p.getEvento_Premios_GIETRB());
        st.setString(2, p.getPremios_Premios_GIETRB());
        st.setString(3, p.getTrabajo_Premios_GIETRB());
        st.setString(4, p.getCategoria_Premios_GIETRB());
        st.setString(5, p.getGrupo_Premios_GIETRB());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Premios_GIETRB_Admin(String Evento_Premios_GIETRB, String Premios_Premios_GIETRB, String Trabajo_Premios_GIETRB, String Categoria_Premios_GIETRB, String Grupo_Premios_GIETRB) {
        this.Evento_Premios_GIETRB = Evento_Premios_GIETRB.toUpperCase();
        this.Premios_Premios_GIETRB = Premios_Premios_GIETRB.toUpperCase();
        this.Trabajo_Premios_GIETRB = Trabajo_Premios_GIETRB.toUpperCase();
        this.Categoria_Premios_GIETRB = Categoria_Premios_GIETRB.toUpperCase();
        this.Grupo_Premios_GIETRB = Grupo_Premios_GIETRB.toUpperCase();


    }

    public String getEvento_Premios_GIETRB() {
        return Evento_Premios_GIETRB;
    }

    public void setEvento_Premios_GIETRB(String Evento_Premios_GIETRB) {
        this.Evento_Premios_GIETRB = Evento_Premios_GIETRB;
    }

    public String getPremios_Premios_GIETRB() {
        return Premios_Premios_GIETRB;
    }

    public void setPremios_Premios_GIETRB(String Premios_Premios_GIETRB) {
        this.Premios_Premios_GIETRB = Premios_Premios_GIETRB;
    }

    public String getTrabajo_Premios_GIETRB() {
        return Trabajo_Premios_GIETRB;
    }

    public void setTrabajo_Premios_GIETRB(String Trabajo_Premios_GIETRB) {
        this.Trabajo_Premios_GIETRB = Trabajo_Premios_GIETRB;
    }

    public String getCategoria_Premios_GIETRB() {
        return Categoria_Premios_GIETRB;
    }

    public void setCategoria_Premios_GIETRB(String Categoria_Premios_GIETRB) {
        this.Categoria_Premios_GIETRB = Categoria_Premios_GIETRB;
    }

    public String getGrupo_Premios_GIETRB() {
        return Grupo_Premios_GIETRB;
    }

    public void setGrupo_Premios_GIETRB(String Grupo_Premios_GIETRB) {
        this.Grupo_Premios_GIETRB = Grupo_Premios_GIETRB;
    }

}
