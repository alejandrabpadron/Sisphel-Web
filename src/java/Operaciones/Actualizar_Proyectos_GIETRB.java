package Operaciones;

import java.util.*;
import java.sql.*;

public class Actualizar_Proyectos_GIETRB {

    private String ID_Proyecto_GIETRB;
    private String Titulo_Proyecto_GIETRB;
    private String Grupo_Proyecto_GIETRB;
    private String Estado_Proyecto_GIETRB;

    public Actualizar_Proyectos_GIETRB(String ID_Proyecto_GIETRB, String Titulo_Proyecto_GIETRB, String Grupo_Proyecto_GIETRB, String Estado_Proyecto_GIETRB) {
        this.ID_Proyecto_GIETRB = ID_Proyecto_GIETRB.toUpperCase();
        this.Titulo_Proyecto_GIETRB = Titulo_Proyecto_GIETRB.toUpperCase();
        this.Grupo_Proyecto_GIETRB = Grupo_Proyecto_GIETRB.toUpperCase();
        this.Estado_Proyecto_GIETRB = Estado_Proyecto_GIETRB.toUpperCase();

    }

    public static synchronized boolean Actualizar(Actualizar_Proyectos_GIETRB p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("UPDATE proyectos set Nombre=?,Grupo=?,Estado=? WHERE ID=?");

        st.setString(1, p.getTitulo_Proyecto_GIETRB());
        st.setString(2, p.getGrupo_Proyecto_GIETRB());
        st.setString(3, p.getEstado_Proyecto_GIETRB());
        st.setString(4, p.getID_Proyecto_GIETRB());


        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public String getID_Proyecto_GIETRB() {
        return ID_Proyecto_GIETRB;
    }

    public void setID_Proyecto_GIETRB(String ID_Proyecto_GIETRB) {
        this.ID_Proyecto_GIETRB = ID_Proyecto_GIETRB;
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
