package com.example.ocean_android_laboratorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btTerceiraTela = findViewById<Button>(R.id.btTerceiraTela)

        btTerceiraTela.setOnClickListener {
            val terceiraTelaIntent = Intent(this, ThirdActivity::class.java)

            terceiraTelaIntent.putExtra("EXTRA_INFO", "Estava na sexta!!")
            startActivity(terceiraTelaIntent)
        }

        /*
        Exercício:
        Revisitar o design das telas e renomear botões, strings, etc   (ok)
        Adicionar um EditText na segunda tela
        Enviar o valor dele para a terceira tela
        Exibir o valor dele no TextView da terceira tela
         */
    }
}