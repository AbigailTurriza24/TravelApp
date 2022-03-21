package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class mexico : AppCompatActivity() {
    var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var destinoM = ArrayList<Pais>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mexico)
        destinoM= ArrayList()

        destinoM?.add(Pais("Monterrey", R.drawable.mont1, R.drawable.mont,"Ciudad en México", "Monterrey, la capital del estado de Nuevo León en el noreste de México, es un extenso centro industrial y de negocios rodeado de montañas. En lo alto se encuentra el Palacio del Obispado, una construcción barroca antigua con un museo regional.. ", "Habitat", "comida"))
        destinoM?.add(Pais("Baja California", R.drawable.baja1, R.drawable.baja,"Ciudad en México", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in.  ", "Habitat", "comida"))
        destinoM?.add(Pais("Mérida", R.drawable.merida1, R.drawable.merida, "Ciudad en México",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoM?.add(Pais("Cancún", R.drawable.cancun1, R.drawable.cancun, "Ciudad en México",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoM?.add(Pais("CDMX", R.drawable.cdmx1, R.drawable.cdmx, "Ciudad en México",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))
        destinoM?.add(Pais("Tulum", R.drawable.tulum1, R.drawable.tulum, "Ciudad en México",
"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut felis id sem dapibus lobortis. In efficitur convallis quam nec tempus. In vel ipsum sit amet libero sollicitudin viverra. Proin sollicitudin egestas nulla, ut faucibus orci pellentesque in."            , "Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, destinoM!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleMexico::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
