package com.example.asus.grupotyt2_prueba_login;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private PeticionesApi service;
    Button btIngresar;
    EditText etUsuario;
    EditText etPass;
    Context context;
    TextView tvPrueba;
    String Usuario;
    String Cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service= AdapApi.getService();

        tvPrueba=(TextView) findViewById(R.id.tvPrueba);
        etUsuario=(EditText) findViewById(R.id.etUsuario);
        etPass=(EditText) findViewById(R.id.etPass);
        btIngresar=(Button) findViewById(R.id.btIngresar);
        btIngresar.setOnClickListener(this);

    }

   public void ObtUsu(){

    service.obtenerUsuario(etUsuario.getText().toString()).enqueue(new Callback<List<Login>>() {
        @Override
        public void onResponse(Call<List<Login>> call, Response<List<Login>> response) {


            List<Login> logins=response.body();
            Usuario=logins.get(0).getUsuario().toString();
            Cont=logins.get(0).getIdUsuario().toString();

            if (Usuario.equals(etUsuario.getText().toString())&& Cont.equals(etPass.getText().toString())){


                Toast.makeText(getBaseContext(),"Bienvenido al sistema",Toast.LENGTH_LONG).show();

                tvPrueba.setText("Exito");



            }else {


                tvPrueba.setText("Fallo");
            }



        }

        @Override
        public void onFailure(Call<List<Login>> call, Throwable t) {
            tvPrueba.setText("Fallo");
        }
    });


   }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btIngresar:

                ObtUsu();

        }



    }
}
