package com.example.travelapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleAustralia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_australia)
        val index = intent.getStringExtra("ID")?.toInt()
        //Log.d("INDEX", index.toString())
        val contacto = index?.let { australia.destinoA?.get(it) }
        var imageView = findViewById<ImageView>(R.id.imageView)
        var tvNombre = findViewById<TextView>(R.id.tvNombre)
        var tvNombreC = findViewById<TextView>(R.id.tvNombreC)
        var tvDescripcion = findViewById<TextView>(R.id.tvDescripcion)


        imageView.setImageResource(contacto!!.imagenD)
        tvNombre.text= contacto?.nombre
        tvNombreC.text= contacto?.paisN
        tvDescripcion.text= contacto?.descripcion

    }
}