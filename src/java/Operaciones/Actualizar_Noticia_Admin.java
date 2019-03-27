package Operaciones;

import java.util.*;
import java.sql.*;

public class Actualizar_Noticia_Admin {

    private String ID_Noticia;
    private String Fecha_Noticia;
    private String Titulo_Noticia;
    private String Codigo_Noticia;
    private String Cuerpo_Noticia;

    public Actualizar_Noticia_Admin(String ID_Noticia, String Fecha_Noticia, String Titulo_Noticia, String Codigo_Noticia, String Cuerpo_Noticia) {
        this.ID_Noticia = ID_Noticia;
        this.Fecha_Noticia = Fecha_Noticia.toUpperCase();
        this.Titulo_Noticia = Titulo_Noticia.toUpperCase();
        this.Codigo_Noticia = Codigo_Noticia.toUpperCase();
        this.Cuerpo_Noticia = Cuerpo_Noticia;

    }

    public static synchronized boolean Noticias(Actualizar_Noticia_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("UPDATE noticias set Fecha=?,Titulo=?,Codigo_Unisinu=?,Cuerpo=? WHERE ID=?");

        st.setString(1, p.getFecha_Noticia());
        st.setString(2, p.getTitulo_Noticia());
        st.setString(3, p.getCodigo_Noticia());
        st.setString(4, p.getCuerpo_Noticia());
        st.setString(5, p.getID_Noticia());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    /**
     * @return the ID_Noticia
     */
    public String getID_Noticia() {
        return ID_Noticia;
    }

    /**
     * @param ID_Noticia the ID_Noticia to set
     */
    public void setID_Noticia(String ID_Noticia) {
        this.ID_Noticia = ID_Noticia;
    }

    /**
     * @return the Fecha_Noticia
     */
    public String getFecha_Noticia() {
        return Fecha_Noticia;
    }

    /**
     * @param Fecha_Noticia the Fecha_Noticia to set
     */
    public void setFecha_Noticia(String Fecha_Noticia) {
        this.Fecha_Noticia = Fecha_Noticia;
    }

    /**
     * @return the Titulo_Noticia
     */
    public String getTitulo_Noticia() {
        return Titulo_Noticia;
    }

    /**
     * @param Titulo_Noticia the Titulo_Noticia to set
     */
    public void setTitulo_Noticia(String Titulo_Noticia) {
        this.Titulo_Noticia = Titulo_Noticia;
    }

    /**
     * @return the Codigo_Noticia
     */
    public String getCodigo_Noticia() {
        return Codigo_Noticia;
    }

    /**
     * @param Codigo_Noticia the Codigo_Noticia to set
     */
    public void setCodigo_Noticia(String Codigo_Noticia) {
        this.Codigo_Noticia = Codigo_Noticia;
    }

    /**
     * @return the Cuerpo_Noticia
     */
    public String getCuerpo_Noticia() {
        return Cuerpo_Noticia;
    }

    /**
     * @param Cuerpo_Noticia the Cuerpo_Noticia to set
     */
    public void setCuerpo_Noticia(String Cuerpo_Noticia) {
        this.Cuerpo_Noticia = Cuerpo_Noticia;
    }

}
