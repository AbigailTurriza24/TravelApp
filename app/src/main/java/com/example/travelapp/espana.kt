package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class espana : AppCompatActivity() {var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var destinoE = ArrayList<Pais>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espana)
        destinoE= ArrayList()

        destinoE?.add(Pais("Madrid", R.drawable.madrid1, R.drawable.madrid, "Ciudad en España",
            "Capital de España y conocida habitualmente como Villa y Corte, Madrid es la mayor ciudad del país y la segunda de la Unión Europea, con una población de más de 3 millones de habitantes (más de 6 en el área metropolitana).", " ", " "))
        destinoE?.add(Pais("Valencia", R.drawable.valencia2, R.drawable.valencia,"Ciudad en España",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoE?.add(Pais("Barcelona", R.drawable.barcelona1, R.drawable.barcelona,  "Ciudad en España",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoE?.add(Pais("Galicia", R.drawable.galicia1, R.drawable.galicia, "Ciudad en España",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoE?.add(Pais("Sevilla", R.drawable.sevilla1, R.drawable.sevilla, "Ciudad en España",
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoE?.add(Pais("Mallorca", R.drawable.mallorca1, R.drawable.palmademallorca, "Ciudad en España",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, destinoE!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleEspana::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
