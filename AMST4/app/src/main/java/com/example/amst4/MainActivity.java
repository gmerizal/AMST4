package com.example.amst4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre, txtApellido, txtUsuario, txtPasswd;
    private Button btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText)findViewById(R.id.txtUsuario);
        txtPasswd = (EditText)findViewById(R.id.txtPasswd);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnRegistro = (Button)findViewById(R.id.btnRegistro);
    }

    public void registrarse(View view){
        Intent intent = new Intent(this, formulario_registro.class);startActivity(intent);
    }

    public void login(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "No cuenta con un usuario", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClick(View view){
        if(view.getId()==R.id.btnLogin){
            Log.d("mensaje","ingreso");
        }else if(view.getId()==R.id.btnRegistro){

        }
    }
}