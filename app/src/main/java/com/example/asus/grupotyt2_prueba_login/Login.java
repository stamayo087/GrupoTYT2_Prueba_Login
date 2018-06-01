package com.example.asus.grupotyt2_prueba_login;

import java.util.ArrayList;

/**
 * Created by Asus on 29/05/2018.
 */

public class Login {

    private String Usuario;
    private String IdUsuario;

    public Login(String usuario, String idUsuario) {
        Usuario = usuario;
        IdUsuario = idUsuario;
    }


    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        IdUsuario = idUsuario;
    }




}
