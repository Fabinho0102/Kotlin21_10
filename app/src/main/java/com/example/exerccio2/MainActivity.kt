package com.example.exerccio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtFahrenheit = findViewById<EditText>(R.id.txtFahrenheit)
        val txtResultado = findViewById<TextView>(R.id.txt_Resultado)

        val btnConverter = findViewById<Button>(R.id.btn_Converter)

        btnConverter.setOnClickListener {
            if (txtFahrenheit.text.isEmpty()) {
                txtFahrenheit.error = "Digite a Temperatura em Fahrenheit"
            } else {
                val fahrenheit = txtFahrenheit.text.toString().toDouble()
                val resultado: Double
                resultado = (fahrenheit - 32) / 1.8000
                txtResultado.text =
                    "$fahrenheit Graus Fahrenheit equivale a $resultado Graus" + " Celsius"
                txtFahrenheit.text.clear()
            }
        }
    }
}

