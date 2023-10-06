package com.example.ffffff

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // funcion para manejar  el boton
        val containedButton = findViewById<Button>(R.id.boton1)
        containedButton.setOnClickListener {
            val mensaje = "El botón fue presionado"
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

            // Crear un Intent para abrir la nueva Activity
            val intent = Intent(this, activity_boton::class.java)

            // Iniciar la nueva Activity
            startActivity(intent)
        }

        ////////////////////////



        ////////////////// segunda funcion de boton
        val outlinedButton = findViewById<Button>(R.id.outlinedButton)
        outlinedButton.setOnClickListener{
            val mensaje = "El botón segundo fue presionado"
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            }
        ///////////

       ////////// tercer boton
        val textButton = findViewById<Button>(R.id.outlinedButton)
         textButton.setOnClickListener{
             val mensaje = "El botón tercer fue presionado"
             Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
             }





    }

        override fun onStart() {
            super.onStart()
            Toast.makeText(this,"meto stara",Toast.LENGTH_LONG).show()
            Log.d(TAG,"llamado star")
        }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"meto RESUMEN",Toast.LENGTH_LONG).show()
        Log.d(TAG,"llamado resumen")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"meto ELIMNAR",Toast.LENGTH_LONG).show()
        Log.d(TAG,"llamado eliminar")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"meto PAUSA",Toast.LENGTH_LONG).show()
        Log.d(TAG,"llamado pausa")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"meto STOP",Toast.LENGTH_LONG).show()
        Log.d(TAG,"llamado Stop")
    }






    }
