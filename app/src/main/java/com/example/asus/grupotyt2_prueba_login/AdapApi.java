package com.example.asus.grupotyt2_prueba_login;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Asus on 29/05/2018.
 */

public class AdapApi {

    private static PeticionesApi service;

    public static  PeticionesApi getService() {

        if (service == null) {

            service = new Retrofit.Builder()
                    .baseUrl(ConstantesApi.urlBase)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(PeticionesApi.class);

        }
        return service;
    }


}
