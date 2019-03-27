package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Proyectos_GIBM_Admin {

    private String Titulo_Proyecto_GIBM;
    private String Grupo_Proyecto_GIBM;
    private String Estado_Proyecto_GIBM;

    public static synchronized boolean ProyectosGIBM(Insertar_Proyectos_GIBM_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO proyectos(Nombre,Grupo,Estado) VALUES (?,?,?)");
        st.setString(1, p.getTitulo_Proyecto_GIBM());
        st.setString(2, p.getGrupo_Proyecto_GIBM());
        st.setString(3, p.getEstado_Proyecto_GIBM());
        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Proyectos_GIBM_Admin(String Titulo_Proyecto_GIBM, String Grupo_Proyecto_GIBM, String Estado_Proyecto_GIBM) {
        this.Titulo_Proyecto_GIBM = Titulo_Proyecto_GIBM.toUpperCase();
        this.Grupo_Proyecto_GIBM = Grupo_Proyecto_GIBM.toUpperCase();
        this.Estado_Proyecto_GIBM = Estado_Proyecto_GIBM.toUpperCase();

    }

    public String getTitulo_Proyecto_GIBM() {
        return Titulo_Proyecto_GIBM;
    }

    public void setTitulo_Proyecto_GIBM(String Titulo_Proyecto_GIBM) {
        this.Titulo_Proyecto_GIBM = Titulo_Proyecto_GIBM;
    }

    public String getGrupo_Proyecto_GIBM() {
        return Grupo_Proyecto_GIBM;
    }

    public void setGrupo_Proyecto_GIBM(String Grupo_Proyecto_GIBM) {
        this.Grupo_Proyecto_GIBM = Grupo_Proyecto_GIBM;
    }

    public String getEstado_Proyecto_GIBM() {
        return Estado_Proyecto_GIBM;
    }

    public void setEstado_Proyecto_GIBM(String Estado_Proyecto_GIBM) {
        this.Estado_Proyecto_GIBM = Estado_Proyecto_GIBM;
    }

  
}
