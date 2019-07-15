package com.example.sesion1_gui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bnGuardar.setOnClickListener {
            var nombre = etNombre.text.toString()
            var correo = etCorreo.text.toString()
            var cedula = etCedula.text.toString()
            var respuesta = nombre +"\n"+ correo +"\n" + cedula
            tvResultado.text = respuesta
        }
    }
}
