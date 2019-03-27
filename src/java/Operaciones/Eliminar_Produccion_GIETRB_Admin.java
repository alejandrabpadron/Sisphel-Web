package Operaciones;

import java.util.*;
import java.sql.*;

public class Eliminar_Produccion_GIETRB_Admin {

    private String ID_Produccion_GIETRB;
     private String Autores_Produccion_GIETRB;
      private String Titulo_Produccion_GIETRB;

    public Eliminar_Produccion_GIETRB_Admin(String ID_Produccion_GIETRB, String Autores_Produccion_GIETRB, String Titulo_Produccion_GIETRB) {
        this.ID_Produccion_GIETRB = ID_Produccion_GIETRB;
        this.Autores_Produccion_GIETRB = Autores_Produccion_GIETRB.toUpperCase();
        this.Titulo_Produccion_GIETRB = Titulo_Produccion_GIETRB.toUpperCase();

    }

    public static synchronized boolean Produccion(Eliminar_Produccion_GIETRB_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("DELETE FROM produccion_cientifica WHERE ID=?");


        st.setString(1, p.getID_Produccion_GIETRB());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public String getID_Produccion_GIETRB() {
        return ID_Produccion_GIETRB;
    }

    public void setID_Produccion_GIETRB(String ID_Produccion_GIETRB) {
        this.ID_Produccion_GIETRB = ID_Produccion_GIETRB;
    }

    public String getAutores_Produccion_GIETRB() {
        return Autores_Produccion_GIETRB;
    }

    public void setAutores_Produccion_GIETRB(String Autores_Produccion_GIETRB) {
        this.Autores_Produccion_GIETRB = Autores_Produccion_GIETRB;
    }

    public String getTitulo_Produccion_GIETRB() {
        return Titulo_Produccion_GIETRB;
    }

    public void setTitulo_Produccion_GIETRB(String Titulo_Produccion_GIETRB) {
        this.Titulo_Produccion_GIETRB = Titulo_Produccion_GIETRB;
    }

  
}
