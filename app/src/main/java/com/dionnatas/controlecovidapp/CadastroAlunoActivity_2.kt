package com.dionnatas.controlecovidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class CadastroAlunoActivity_2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_aluno_2)

        supportActionBar?.hide()

        val botaoSalvar = findViewById<Button>(R.id.btn_salvarAluno)
        botaoSalvar.setOnClickListener(this)

        val botaoVoltar = findViewById<Button>(R.id.btn_voltaCadastroAluno2)
        botaoVoltar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.btn_salvarAluno){
            salvarAluno()        }
        if (id == R.id.btn_voltaCadastroAluno2){
            voltaTelaAnterior()
        }
    }

    private fun voltaTelaAnterior() {
        startActivity(Intent(this, CadastroAlunoActivity2::class.java))
    }

    private fun salvarAluno() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}