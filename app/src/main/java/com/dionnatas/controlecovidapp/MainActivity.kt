package com.dionnatas.controlecovidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val botaoNovoAluno = findViewById<Button>(R.id.btn_novoAluno)
        botaoNovoAluno.setOnClickListener(this)

        val botaoSalvar = findViewById<Button>(R.id.btn_salvarControle)
        botaoSalvar.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val id = v?.id
        if (id == R.id.btn_novoAluno) {
            cadastroAluno()
        }
        if (id == R.id.btn_salvarControle) {
            val resp = onRadioButtonClicked()
            if (resp) {
                cadastraAlunoRisco()
            } else {
                recarregaview()
            }
        }
    }

    private fun recarregaview() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun cadastraAlunoRisco() {
        startActivity(Intent(this, AlunoRiscoActivity::class.java))
    }

    private fun cadastroAluno() {
        startActivity(Intent(this, CadastroAlunoActivity::class.java))
    }

    fun onRadioButtonClicked(): Boolean {
        radioGroup = findViewById(R.id.group_temperaturaAluno)
        val intSelectButton: Int = radioGroup!!.checkedRadioButtonId
        radioButton = findViewById(intSelectButton)
        if (radioButton.text == "Maior que 37,5º") {
            return true
        } else if (radioButton.text == "Menor que 37,5º") {
            return false
        } else {
            recarregaview()
        }
        return false
    }
}