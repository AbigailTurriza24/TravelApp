package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class usa : AppCompatActivity() {
    var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var destinoU = ArrayList<Pais>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usa)
        destinoU= ArrayList()

        destinoU?.add(Pais("New York", R.drawable.new1, R.drawable.images,"Ciudad en USA",
          "Nueva York está considerada como una ciudad global, dadas sus influencias a nivel mundial en los medios de comunicación, en la política, en la educación, en el entretenimiento y la moda. La influencia artística y cultural de la ciudad es de las más fuertes del país.\n"  ,"Habitat", "comida"))
        destinoU?.add(Pais("Los Ángeles", R.drawable.angeles1, R.drawable.angeles,"Ciudad en USA",
         "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."   , "Habitat", "comida"))
        destinoU?.add(Pais("Chicago", R.drawable.chicago1, R.drawable.chicago, "Ciudad en USA",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."    , "Habitat", "comida"))
        destinoU?.add(Pais("San Francisco", R.drawable.san1, R.drawable.san, "Ciudad en USA",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoU?.add(Pais("Washington D.C.", R.drawable.washington1, R.drawable.washington, "Ciudad en USA",
         "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."   , "Habitat", "comida"))
        destinoU?.add(Pais("Las vegas", R.drawable.vegas1, R.drawable.vegas, "Ciudad en USA",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in.", "Habitat", "comida"))

        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, destinoU!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleUsa::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}