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

    private EditText txtNombre, txtApellido, textUsuario, textPasswd;
    private Button btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUsuario = (EditText)findViewById(R.id.textUsuario);
        textPasswd = (EditText)findViewById(R.id.textPasswd);

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
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.calendar_view:
                // codigo calendario
                return true;
            case R.id.video_view:
                //codigo viddeo
                return true;
            case R.id.mapa:
                // codigo mapa
                return true;
            case R.id.grafico:
                //codigo grafico
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
   }
}
