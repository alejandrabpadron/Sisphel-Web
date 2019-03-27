package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Proyectos_GIETRB_Admin {

    private String Titulo_Proyecto_GIETRB;
    private String Grupo_Proyecto_GIETRB;
    private String Estado_Proyecto_GIETRB;

    public static synchronized boolean ProyectosGIETRB(Insertar_Proyectos_GIETRB_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO proyectos(Nombre,Grupo,Estado) VALUES (?,?,?)");
        st.setString(1, p.getTitulo_Proyecto_GIETRB());
        st.setString(2, p.getGrupo_Proyecto_GIETRB());
        st.setString(3, p.getEstado_Proyecto_GIETRB());
        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Proyectos_GIETRB_Admin(String Titulo_Proyecto_GIETRB, String Grupo_Proyecto_GIETRB, String Estado_Proyecto_GIETRB) {
        this.Titulo_Proyecto_GIETRB = Titulo_Proyecto_GIETRB.toUpperCase();
        this.Grupo_Proyecto_GIETRB = Grupo_Proyecto_GIETRB.toUpperCase();
        this.Estado_Proyecto_GIETRB = Estado_Proyecto_GIETRB.toUpperCase();

    }

    public String getTitulo_Proyecto_GIETRB() {
        return Titulo_Proyecto_GIETRB;
    }

    public void setTitulo_Proyecto_GIETRB(String Titulo_Proyecto_GIETRB) {
        this.Titulo_Proyecto_GIETRB = Titulo_Proyecto_GIETRB;
    }

    public String getGrupo_Proyecto_GIETRB() {
        return Grupo_Proyecto_GIETRB;
    }

    public void setGrupo_Proyecto_GIETRB(String Grupo_Proyecto_GIETRB) {
        this.Grupo_Proyecto_GIETRB = Grupo_Proyecto_GIETRB;
    }

    public String getEstado_Proyecto_GIETRB() {
        return Estado_Proyecto_GIETRB;
    }

    public void setEstado_Proyecto_GIETRB(String Estado_Proyecto_GIETRB) {
        this.Estado_Proyecto_GIETRB = Estado_Proyecto_GIETRB;
    }
  
}
