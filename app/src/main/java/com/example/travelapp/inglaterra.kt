package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class inglaterra : AppCompatActivity() {
    var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var destinoI = ArrayList<Pais>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inglaterra)
        destinoI= ArrayList()

        destinoI?.add(Pais("Londres", R.drawable.londres, R.drawable.londres1,"Ciudad en Inglaterra",
"Londres continúa siendo una ciudad importante en todo el mundo debido no sólo al poder económico sino también, y principalmente, a que se encuentra repleta de rincones encantadores que visitar y posee un bagaje cultural impactante que hace que miles de viajeros arriben a ella cada año"            , "Habitat", "comida"))
        destinoI?.add(Pais("Liverpool", R.drawable.liverpool, R.drawable.liverpool1,"Ciudad en Inglaterra",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in.",            "Habitat", "comida"))
        destinoI?.add(Pais("Cambridge", R.drawable.cambridge, R.drawable.cambridge1, "Ciudad en Inglaterra",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoI?.add(Pais("Oxford", R.drawable.oxfor, R.drawable.oxfor1, "Ciudad en Inglaterra",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoI?.add(Pais("Edimburgo", R.drawable.edimburgo, R.drawable.edimburgo1, "Ciudad en Inglaterra",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoI?.add(Pais("Mánchester", R.drawable.manchester, R.drawable.manchester3, "Ciudad en Inglaterra",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, destinoI!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleInglaterra::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}