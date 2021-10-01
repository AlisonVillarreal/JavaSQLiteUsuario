package com.cdp.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cdp.agenda.db.DbContactos;

public class NuevoActivity extends AppCompatActivity {

    EditText txtNombre, txtApellidos, txtTelefono, txtCorreoElectronico, txtUsuario, txtPassword;
    Button btnGuarda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtCorreoElectronico = findViewById(R.id.txtCorreoElectronico);
        txtUsuario = findViewById(R.id.txtusuario);
        txtPassword = findViewById(R.id.txtpassword);

        btnGuarda = findViewById(R.id.btnGuarda);

        btnGuarda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!txtNombre.getText().toString().equals("") && !txtApellidos.getText().toString().equals("") && !txtTelefono.getText().toString().equals("") && !txtCorreoElectronico.getText().toString().equals("") && !txtUsuario.getText().toString().equals("") && !txtPassword.getText().toString().equals("")) {

                    DbContactos dbContactos = new DbContactos(NuevoActivity.this);
                    long id = dbContactos.insertarContacto(txtNombre.getText().toString(), txtApellidos.getText().toString(), txtTelefono.getText().toString(), txtCorreoElectronico.getText().toString(), txtUsuario.getText().toString(), txtPassword.getText().toString());

                    if (id > 0) {
                        Toast.makeText(NuevoActivity.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                        limpiar();
                    } else {
                        Toast.makeText(NuevoActivity.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(NuevoActivity.this, "DEBE LLENAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void limpiar() {
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtCorreoElectronico.setText("");
        txtUsuario.setText("");
        txtPassword.setText("");
    }
}