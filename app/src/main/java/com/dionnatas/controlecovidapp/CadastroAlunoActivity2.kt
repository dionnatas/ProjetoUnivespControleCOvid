package com.dionnatas.controlecovidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class CadastroAlunoActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_aluno2)

        supportActionBar?.hide()

        val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(this, R.array.opcLocomocaoAluno, android.R.layout.simple_spinner_item)
            .also{ adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter}

        val botaoProxTela = findViewById<Button>(R.id.btn_prox_tela2)
        botaoProxTela.setOnClickListener(this)

        val botaoVoltar = findViewById<Button>(R.id.btn_voltaCadastroAluno)
        botaoVoltar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.btn_prox_tela2){
            proximaTela()
        }
        if (id == R.id.btn_voltaCadastroAluno){
            voltaTelaAnterior()
        }
    }

    private fun voltaTelaAnterior() {
        startActivity(Intent(this, CadastroAlunoActivity::class.java))
    }

    private fun proximaTela() {
        startActivity(Intent(this, CadastroAlunoActivity_2::class.java))
    }
}