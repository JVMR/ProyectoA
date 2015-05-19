package com.example.romario.proyectoa;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.romario.proyectoa.beans.Profesor;
import com.example.romario.proyectoa.dao.Factory;
import com.example.romario.proyectoa.dao.profesor.ProfesorDAO;


public class LoginActivity extends ActionBarActivity implements View.OnClickListener{

    EditText edtUsuario, edtPassword;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsuario=(EditText)findViewById(R.id.edtUsuario);
        edtPassword=(EditText)findViewById(R.id.edtPassword);
        btnEntrar=(Button)findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String username = edtUsuario.getText().toString();
        String password = edtPassword.getText().toString();
        boolean flag=true;
        if(username.isEmpty())
        {
            edtUsuario.setError("Usuario inválido");
            flag=false;
        }

        if(password.isEmpty())
        {
            edtPassword.setError("Password inválido");
            flag=false;
        }

        if(flag)
        {
            Factory factory = Factory.getFactory(Factory.TIPO_SQLITE);
            ProfesorDAO profesorDAO = factory.getProfesorDAO(this);
            Profesor profesor=profesorDAO.logear(username,password);
            if(profesor!=null)
            {
                Intent ir = new Intent(this,MainActivity.class);
                ir.putExtra("profesor", profesor);
                startActivity(ir);
            }
            else
            {
                AlertDialog alerta = new AlertDialog.Builder(this).create();
                alerta.setTitle("Error");
                alerta.setMessage("El usuario o el password es incorrecto");
                alerta.setIcon(R.drawable.error);
                alerta.setButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edtPassword.setText("");
                    }
                });
                alerta.show();
            }
        }

    }
}
