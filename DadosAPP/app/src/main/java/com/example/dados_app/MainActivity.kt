package com.example.dados_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button2 = findViewById<Button>(R.id.button2)
        val intentnext = Intent(this, activity_dados::class.java)
        val buttonNext = findViewById<Button>(R.id.buttonNext)

        buttonNext.setOnClickListener {



                startActivity(intentnext)
            }



            button2.setOnClickListener {
            rolarDados(6)
        }




    }

    private fun rolarDados(lados: Int) {
        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textView)

        textResultado.text = valor.toString()

        val imagR = imag06(valor)

        val imagdado = findViewById<ImageView>(R.id.imageView)
        imagdado.setImageResource(imagR as Int)

    }

    private fun imag06(valor: Int): Any {
        return when (valor) {
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6

        }
    }

}