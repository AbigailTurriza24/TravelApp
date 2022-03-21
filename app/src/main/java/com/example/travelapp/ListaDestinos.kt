package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListaDestinos: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_destinos)
        var destinos: ArrayList<Lista> = ArrayList()
        destinos.add(Lista("España", R.drawable.espain))
        destinos.add(Lista("Inglaterra", R.drawable.inglaterra))
        destinos.add(Lista("Italia", R.drawable.italia))
        destinos.add(Lista("Estados Unidos", R.drawable.usa))
        destinos.add(Lista("Australia", R.drawable.australia))
        destinos.add(Lista("México", R.drawable.mexico))


        val listaDestino = findViewById<ListView>(R.id.listaDestino)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador = AdaptadorCustom(this, destinos)

        listaDestino.adapter = adaptador
        listaDestino.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                if (position == 0) {
                    startActivity(Intent(this, espana::class.java))
                } else if (position == 1) {
                    startActivity(Intent(this, inglaterra::class.java))
                }else if(position==2){
                startActivity(Intent(this, Italia::class.java))
            }else if(position==3){
                startActivity(Intent(this, usa::class.java))
            }else if(position==4){
                startActivity(Intent(this, australia::class.java))
            }else{
                startActivity(Intent(this, mexico::class.java))
            }

                }

            }
    }
