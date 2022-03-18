package com.example.dados_app

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

        button2.setOnClickListener {
            rolarDados(6)
        }

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            rolarDados2(12)
        }


    }

    private fun rolarDados2(lados: Int) {
        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textView)

        textResultado.text = valor.toString()

        val imagR = imag12(valor)

        val imagdado = findViewById<ImageView>(R.id.imageView)
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