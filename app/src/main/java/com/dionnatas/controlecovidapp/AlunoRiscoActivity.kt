package com.dionnatas.controlecovidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlunoRiscoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aluno_risco)
        supportActionBar?.hide()

        val botaoSalvar = findViewById<Button>(R.id.btn_salvarAlunoRisco)
        botaoSalvar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.btn_salvarAlunoRisco ){
            salvarAlunoRisco()
        }
    }

    private fun salvarAlunoRisco() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}