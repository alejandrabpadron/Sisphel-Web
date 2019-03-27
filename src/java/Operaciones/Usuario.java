package Operaciones;

import java.sql.*;
import java.util.*;

public class Usuario {

    private String login;
    private String pwd;

    public Usuario(String login, String pwd) {

        this.login = login == null ? "" : login.trim();
        this.pwd = pwd == null ? "" : pwd.trim();

    }

    public static synchronized Usuario Validar(String s_login, String s_pwd) throws SQLException {
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();
        Usuario obj = null;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM usuarios  "
                + " WHERE Usuario = '" + s_login + "' AND Password= '" + s_pwd + "' ");
        while (rs.next()) {
            obj = new Usuario(rs.getString(1), rs.getString(2));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return obj;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
