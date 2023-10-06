package com.example.ffffff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_boton : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boton)

        // Configurar el botón para abrir MainActivity
        val botonAbrirMain = findViewById<Button>(R.id.btnGoToButtons)
        botonAbrirMain.setOnClickListener {
            // Crear un Intent para abrir MainActivity
            val intent = Intent(this, MainActivity::class.java)

            // Iniciar MainActivity
            startActivity(intent)

            // Cerrar la actividad actual si es necesario
            finish()
        }
    }
}
