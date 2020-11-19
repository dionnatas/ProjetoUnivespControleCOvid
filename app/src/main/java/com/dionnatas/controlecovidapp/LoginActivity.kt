package com.dionnatas.controlecovidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text


class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val usuario = findViewById<TextView>(R.id.username).text
        val senha = findViewById<TextView>(R.id.password).text

        val botaoLogar = findViewById<Button>(R.id.btn_login)
        botaoLogar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        val usuario = findViewById<TextView>(R.id.username).text
        val senha = findViewById<TextView>(R.id.password).text

        if (id == R.id.btn_login) {
            if (usuario.toString() != "" && senha.toString() != "") {
                logar()
            } else{
                cadastratUsuario()
            }
        }
    }

    private fun cadastratUsuario() {
        startActivity(Intent(this, CadastroUsuarioActivity::class.java))
    }

    private fun logar() {
        startActivity(Intent(this, MainActivity::class.java))
    }

}