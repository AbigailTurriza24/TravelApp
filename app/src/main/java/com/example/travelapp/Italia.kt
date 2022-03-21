package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class Italia : AppCompatActivity() {
    var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var destinoT = ArrayList<Pais>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italia)
        destinoT= ArrayList()

        destinoT?.add(Pais("Roma", R.drawable.roma1, R.drawable.roma,"Ciudad en Italia",
           "En Roma hay muchísimo que ver: monumentos, plazas, edificios históricos, jardines y museos. Hay tanto que puede ser complicado saber por dónde empezar pero entre lo que no te puedes perder está: El Coliseo, el Circo Maximo y el Palatino. El Vaticano con la plaza y Basílica de San Pedro así como los Museos Vaticanos" , "Habitat", "comida"))
        destinoT?.add(Pais("Venecia", R.drawable.venecia1, R.drawable.venecia, "Ciudad en Italia",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in." ,           "Habitat", "comida"))
        destinoT?.add(Pais("Florencia", R.drawable.florencia1, R.drawable.florencia2, "Ciudad en Italia",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoT?.add(Pais("Milán", R.drawable.milan1, R.drawable.milan, "Ciudad en Italia",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoT?.add(Pais("Turín", R.drawable.turin1, R.drawable.turin, "Ciudad en Italia",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoT?.add(Pais("Bari", R.drawable.bari1, R.drawable.bari, "Ciudad en Italia",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."    , "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, destinoT!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleItalia::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}