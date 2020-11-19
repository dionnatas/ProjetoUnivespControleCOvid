package com.dionnatas.controlecovidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class CadastroAlunoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_aluno)

        supportActionBar?.hide()

        val botaoProxTela = findViewById<Button>(R.id.btn_prox_tela)
        botaoProxTela.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.btn_prox_tela){
            proxTela()
        }
    }

    private fun proxTela() {
        startActivity(Intent(this, CadastroAlunoActivity2::class.java))
    }
}