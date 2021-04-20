package com.zetzed.app3.dio.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            val altura = altura.text.toString().toFloatOrNull() / 100 //Pega o valor da altura e converte em metros.
            val peso = peso.text.toString().toFloatOrNull() //Pega o peso e converte para float.
            val res = (peso/(altura*altura)) //Fórmula para calcular o IMC
            resultado.text = "%.2f".format(res) //Formata o resultado para mostrar apenas 2 dígitos decimais
        }

    }
}