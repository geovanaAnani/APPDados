package com.example.dados_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class activity_dados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val button = findViewById<Button>(R.id.button12)
        val intentnexxt = Intent(this, activity_dados2::class.java)


        val buttonnexxt = findViewById<Button>(R.id.buttonnexxt)

        buttonnexxt.setOnClickListener {

            startActivity(intentnexxt)
        }

        val buttonVoltarr = findViewById<Button>(R.id.buttonVoltarr)
        buttonVoltarr.setOnClickListener {
            finish()
        }

        button.setOnClickListener {
            rolarDados2(12)
        }
    }
    private fun rolarDados2(lados: Int) {
        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textView3)

        textResultado.text = valor.toString()

        val imagR = imag12(valor)

        val imagdado = findViewById<ImageView>(R.id.imageView4)
        imagdado.setImageResource(imagR as Int)

    }
    private fun imag12(valor: Int): Any {
        return when (valor) {
            1 -> R.drawable.dado121
            2 -> R.drawable.dado122
            3 -> R.drawable.dado123
            4 -> R.drawable.dado124
            5 -> R.drawable.dado125
            6 -> R.drawable.dado126
            7 -> R.drawable.dado127
            8 -> R.drawable.dado128
            9 -> R.drawable.dado129
            10 -> R.drawable.dado1210
            11 -> R.drawable.dado1211
            else -> R.drawable.dado1212

        }
    }
















}
