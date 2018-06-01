package com.example.asus.grupotyt2_prueba_login;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Asus on 29/05/2018.
 */

public interface PeticionesApi {

@GET("Login.php")
Call<List<Login>> obtenerUsuario(@Query("Usuario") String usuario);

}
