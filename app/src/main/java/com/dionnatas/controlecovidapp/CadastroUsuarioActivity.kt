package com.dionnatas.controlecovidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class CadastroUsuarioActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        supportActionBar?.hide()

        val botaoSalvar = findViewById<Button>(R.id.btn_salvar_usuario)
        botaoSalvar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.btn_salvar_usuario){
            salvarUsuario()
        }
    }

    private fun salvarUsuario() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}