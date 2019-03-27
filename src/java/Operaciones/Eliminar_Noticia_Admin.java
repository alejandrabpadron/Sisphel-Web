package Operaciones;

import java.util.*;
import java.sql.*;

public class Eliminar_Noticia_Admin {

    private String ID_Noticia;
    private String Titulo_Noticia;

    public Eliminar_Noticia_Admin(String ID_Noticia, String Titulo_Noticia) {
        this.ID_Noticia = ID_Noticia;
        this.Titulo_Noticia = Titulo_Noticia.toUpperCase();

    }

    public static synchronized boolean Noticias(Eliminar_Noticia_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("DELETE FROM noticias WHERE ID=?");


        st.setString(1, p.getID_Noticia());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public String getID_Noticia() {
        return ID_Noticia;
    }

    public void setID_Noticia(String ID_Noticia) {
        this.ID_Noticia = ID_Noticia;
    }

    public String getTitulo_Noticia() {
        return Titulo_Noticia;
    }

    public void setTitulo_Noticia(String Titulo_Noticia) {
        this.Titulo_Noticia = Titulo_Noticia;
    }
}
