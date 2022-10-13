package com.sergio.labkotlin

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.mensajeCorto(texto: String){ //A partir del context, es decir, se puede llamar desde cualquier lado
    Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
}

fun MutableList<Int>.intercambiarElementos(index1: Int, index2: Int){ //MutableList Es una lista (en realidad una interfaz) que puede ser modificada
    var tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

//Función en una línea que, como es a partir del context, se puede usar desde cualquier lado
fun Context.registrarPendiente(texto: String) = Log.i("TODO", texto)