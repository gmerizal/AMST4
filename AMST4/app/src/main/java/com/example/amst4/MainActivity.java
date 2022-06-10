package com.example.amst4;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre, txtApellido, textUsuario, textPasswd;
    private Button btnLogin, btnRegistro;

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
                Intent intent = new Intent(this, CalendarViewActivity.class);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra(CalendarContract.Events.TITLE,"Fiesta");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Casa de Guillermo");
                intent.putExtra(CalendarContract.Events.DESCRIPTION, "Una parrillada");
                GregorianCalendar calDate = new GregorianCalendar(2022, 6, 10);
                intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY,true);
                startActivity(intent);
                return true;
            case R.id.video_view:
                Intent intent1 = new Intent(this, VideoViewActivity.class);
                startActivity(intent1);
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
