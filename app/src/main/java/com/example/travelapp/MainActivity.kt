package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtPass = findViewById<EditText>(R.id.txtPass)

        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener{
            val nUsuario = txtNombre.getText().toString()
            val pass:String = txtPass.getText().toString()
            if (nUsuario.equals("Abigail") && pass.equals("abi2406")){
                var intent = Intent(this, ListaDestinos::class.java)
                startActivity(intent)
                Toast.makeText(this, "Bienvenido a TravelApp", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
            }
        }

    }

}