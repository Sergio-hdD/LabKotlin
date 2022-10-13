package com.sergio.labkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var tvResultado: TextView
    private lateinit var btnDado: Button
    private lateinit var btnGenrala: Button
    private lateinit var btnQuienArranca: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vincularDatosVista()

        btnDado.setOnClickListener {
            val valorRandom = numeroDadoRandom()
            tvResultado.setText(valorRandom.toString())

            registrarPendiente("Mostrar imagen con el número que salió en el dado")

        }

        btnGenrala.setOnClickListener {
            var lista = mutableListOf<Int>()
            for (i in 1..5){
                lista.add(numeroDadoRandom())
            }
            tvResultado.setText(lista.toString()) //Va a mostrar 5 números random entre 1 y 5, en formato lista

            lista.intercambiarElementos(0, 4) //Intrercambio entre si los elementos de la posicion 0 y 4 de la lista

            mensajeCorto(lista.toString()) //Muestro la lista con los valores de los extremos intercambiados

        }

        btnQuienArranca.setOnClickListener {
            var resultado = ""
            if(numeroRandom(1, 2) == 1){
                resultado = "Yo"
            }else{
                resultado = "Vos"
            }
            tvResultado.setText(resultado)

            mensajeCorto("A jugar...")

        }

    }

    private fun vincularDatosVista() {
        tvResultado = findViewById(R.id.tvResultado)
        btnDado = findViewById(R.id.btnDado)
        btnGenrala = findViewById(R.id.btnGenerala)
        btnQuienArranca = findViewById(R.id.btnQuienArranca)
    }

    //Función en  una línea
    private fun numeroDadoRandom() = numeroRandom(1, 6)

    private fun numeroRandom(a: Int, b: Int) = (a..b).random() //1 número random entre a y b

}