package Operaciones;

import java.util.*;
import java.sql.*;

public class Eliminar_Produccion_GIBM_Admin {

    private String ID_Produccion_GIBM;
     private String Autores_Produccion_GIBM;
      private String Titulo_Produccion_GIBM;

    public Eliminar_Produccion_GIBM_Admin(String ID_Produccion_GIBM, String Autores_Produccion_GIBM, String Titulo_Produccion_GIBM) {
        this.ID_Produccion_GIBM = ID_Produccion_GIBM;
        this.Autores_Produccion_GIBM = Autores_Produccion_GIBM.toUpperCase();
        this.Titulo_Produccion_GIBM = Titulo_Produccion_GIBM.toUpperCase();

    }

    public static synchronized boolean Produccion(Eliminar_Produccion_GIBM_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("DELETE FROM produccion_cientifica WHERE ID=?");


        st.setString(1, p.getID_Produccion_GIBM());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public String getID_Produccion_GIBM() {
        return ID_Produccion_GIBM;
    }

    public void setID_Produccion_GIBM(String ID_Produccion_GIBM) {
        this.ID_Produccion_GIBM = ID_Produccion_GIBM;
    }

    public String getAutores_Produccion_GIBM() {
        return Autores_Produccion_GIBM;
    }

    public void setAutores_Produccion_GIBM(String Autores_Produccion_GIBM) {
        this.Autores_Produccion_GIBM = Autores_Produccion_GIBM;
    }

    public String getTitulo_Produccion_GIBM() {
        return Titulo_Produccion_GIBM;
    }

    public void setTitulo_Produccion_GIBM(String Titulo_Produccion_GIBM) {
        this.Titulo_Produccion_GIBM = Titulo_Produccion_GIBM;
    }

  
}
