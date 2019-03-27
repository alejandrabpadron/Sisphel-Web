package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Premios_GIBM_Admin {

    private String Evento_Premios_GIBM;
    private String Premios_Premios_GIBM;
    private String Trabajo_Premios_GIBM;
    private String Categoria_Premios_GIBM;
    private String Grupo_Premios_GIBM;

    public static synchronized boolean PremiosGIBM(Insertar_Premios_GIBM_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO premios(Evento,Premio,Trabajo,Categoria,Grupo) VALUES (?,?,?,?,?)");
        st.setString(1, p.getEvento_Premios_GIBM());
        st.setString(2, p.getPremios_Premios_GIBM());
        st.setString(3, p.getTrabajo_Premios_GIBM());
        st.setString(4, p.getCategoria_Premios_GIBM());
        st.setString(5, p.getGrupo_Premios_GIBM());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Premios_GIBM_Admin(String Evento_Premios_GIBM, String Premios_Premios_GIBM, String Trabajo_Premios_GIBM, String Categoria_Premios_GIBM, String Grupo_Premios_GIBM) {
        this.Evento_Premios_GIBM = Evento_Premios_GIBM.toUpperCase();
        this.Premios_Premios_GIBM = Premios_Premios_GIBM.toUpperCase();
        this.Trabajo_Premios_GIBM = Trabajo_Premios_GIBM.toUpperCase();
        this.Categoria_Premios_GIBM = Categoria_Premios_GIBM.toUpperCase();
        this.Grupo_Premios_GIBM = Grupo_Premios_GIBM.toUpperCase();


    }

    public String getEvento_Premios_GIBM() {
        return Evento_Premios_GIBM;
    }

    public void setEvento_Premios_GIBM(String Evento_Premios_GIBM) {
        this.Evento_Premios_GIBM = Evento_Premios_GIBM;
    }

    public String getPremios_Premios_GIBM() {
        return Premios_Premios_GIBM;
    }

    public void setPremios_Premios_GIBM(String Premios_Premios_GIBM) {
        this.Premios_Premios_GIBM = Premios_Premios_GIBM;
    }

    public String getTrabajo_Premios_GIBM() {
        return Trabajo_Premios_GIBM;
    }

    public void setTrabajo_Premios_GIBM(String Trabajo_Premios_GIBM) {
        this.Trabajo_Premios_GIBM = Trabajo_Premios_GIBM;
    }

    public String getCategoria_Premios_GIBM() {
        return Categoria_Premios_GIBM;
    }

    public void setCategoria_Premios_GIBM(String Categoria_Premios_GIBM) {
        this.Categoria_Premios_GIBM = Categoria_Premios_GIBM;
    }

    public String getGrupo_Premios_GIBM() {
        return Grupo_Premios_GIBM;
    }

    public void setGrupo_Premios_GIBM(String Grupo_Premios_GIBM) {
        this.Grupo_Premios_GIBM = Grupo_Premios_GIBM;
    }

  
}
