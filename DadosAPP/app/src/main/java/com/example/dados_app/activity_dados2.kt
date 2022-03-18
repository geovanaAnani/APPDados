package com.example.dados_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class activity_dados2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados2)
        val button = findViewById<Button>(R.id.button3)




        val buttonvoltar = findViewById<Button>(R.id.buttonvoltar)
        buttonvoltar.setOnClickListener {
            finish()
        }


        button.setOnClickListener {
            rolarDados2(20)
        }
    }

    private fun rolarDados2(lados: Int) {
        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textView2)

        textResultado.text = valor.toString()

        val imagR = imag20(valor)

        val imagdado = findViewById<ImageView>(R.id.imageView5)
        imagdado.setImageResource(imagR as Int)

    }

    private fun imag20(valor: Int): Any {
        return when (valor) {
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            6 -> R.drawable.d6
            7 -> R.drawable.d7
            8 -> R.drawable.d8
            9 -> R.drawable.d9
            10 -> R.drawable.d10
            11 -> R.drawable.d11
            12 -> R.drawable.d12
            13 -> R.drawable.d13
            14 -> R.drawable.d14
            15 -> R.drawable.d15
            16 -> R.drawable.d16
            17 -> R.drawable.d17
            18 -> R.drawable.d18
            19 -> R.drawable.d19
            else -> R.drawable.d20

        }
    }
}