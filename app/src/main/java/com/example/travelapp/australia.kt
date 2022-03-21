package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class australia : AppCompatActivity() {
    var grid: GridView?=null
    var adaptador:AdaptadorCustumGrid?=null
    companion object{
        var destinoA = ArrayList<Pais>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_australia)
        destinoA= ArrayList()

        destinoA?.add(Pais("Sydney", R.drawable.sydney1, R.drawable.sydney,"Ciudad en Australia", "Sydney es una de las ciudades más multiculturales del mundo y con mayor calidad de vida. Quizás por ello, logra atraer una gran parte de la población australiana. Se trata de una ciudad dinámica con una amplia oferta laboral, lo que la convierte en una tierra de oportunidades tanto en el ámbito profesional como en el personal. ", "Ópera de Sydney", "Inglés"))
        destinoA?.add(Pais("Melbourne", R.drawable.mel1, R.drawable.mel,"Ciudad en Australia", "Melbourne es la más europea. Su alta calidad de vida le ha merecido ser reconocida como la mejor ciudad del mundo para vivir durante varios años consecutivos. Sus habitantes gozan de numerosas oportunidades laborales y elevados salarios.\n" +
                "\n", "Habitat", "comida"))
        destinoA?.add(Pais("Brisbane", R.drawable.bris1, R.drawable.bris, "Ciudad en Australia",
            "Brisbane es la tercera de las principales ciudades de Australia, y también capital del estado de Queensland. Con un estilo de vida relajado, pero muy social, es habitual que su gente pasee por las calles, haga barbacoas en parques de la ciudad, organice eventos al aire libre o pase el rato en los bares y cafeterías.\n" +
                    "\n", "Habitat", "comida"))
        destinoA?.add(Pais("Perth", R.drawable.perth1, R.drawable.perth, "Ciudad en Australia",
            "Perth es un precioso rincón del mundo en donde pueden encontrarse las mejores puestas de sol de toda Oceanía. Alejada del resto de las grandes ciudades de Australia y del excesivo turismo, Perth es una ciudad australiana muy tranquila que mantiene la esencia de sus orígenes.","Habitat", "comida"))
        destinoA?.add(Pais("Gold Coast ", R.drawable.gold1, R.drawable.gld, "Ciudad en Australia",
            " Gold Coast es una ciudad de dimensiones reducida aunque su elevado turismo veraniego supone un alto volumen de trabajo en el sector de la Hostelería. Sus 57 kilómetros de playas de arena blanca y perfectas olas combinadas con rascacielos, parques temáticos y una vida nocturna activa le han valido el apodo de «el Miami» de Australia.","Habitat" ,"comida"))
        destinoA?.add(Pais("Byron Bay", R.drawable.byron1, R.drawable.byron, "Ciudad en Australia",
            " Byron Bay es una pequeña población de Australia que, a pesar de tener algo menos de 10.000 habitantes, atrae a miles de turistas de todo el mundo año tras año. Las fantásticas playas de la zona hacen de Byron Bay un destino muy atractivo para los amantes del surf, el submarinismo y otros deportes acuáticos.","Habitat", "comida"))


        grid=findViewById<GridView>(R.id.grid)
        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        adaptador =  AdaptadorCustumGrid(this, destinoA!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleAustralia::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}