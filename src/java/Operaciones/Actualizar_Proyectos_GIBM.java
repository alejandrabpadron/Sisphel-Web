package Operaciones;

import java.util.*;
import java.sql.*;

public class Actualizar_Proyectos_GIBM {

    private String ID_Proyecto_GIBM;
    private String Titulo_Proyecto_GIBM;
    private String Grupo_Proyecto_GIBM;
    private String Estado_Proyecto_GIBM;

    public Actualizar_Proyectos_GIBM(String ID_Proyecto_GIBM, String Titulo_Proyecto_GIBM, String Grupo_Proyecto_GIBM, String Estado_Proyecto_GIBM) {
        this.ID_Proyecto_GIBM = ID_Proyecto_GIBM.toUpperCase();
        this.Titulo_Proyecto_GIBM = Titulo_Proyecto_GIBM.toUpperCase();
        this.Grupo_Proyecto_GIBM = Grupo_Proyecto_GIBM.toUpperCase();
        this.Estado_Proyecto_GIBM = Estado_Proyecto_GIBM.toUpperCase();

    }

    public static synchronized boolean Actualizar(Actualizar_Proyectos_GIBM p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("UPDATE proyectos set Nombre=?,Grupo=?,Estado=? WHERE ID=?");

        st.setString(1, p.getTitulo_Proyecto_GIBM());
        st.setString(2, p.getGrupo_Proyecto_GIBM());
        st.setString(3, p.getEstado_Proyecto_GIBM());
        st.setString(4, p.getID_Proyecto_GIBM());


        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public String getID_Proyecto_GIBM() {
        return ID_Proyecto_GIBM;
    }

    public void setID_Proyecto_GIBM(String ID_Proyecto_GIBM) {
        this.ID_Proyecto_GIBM = ID_Proyecto_GIBM;
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
