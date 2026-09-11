package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisciplinasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_disciplinas)

        val txtProgramacao = findViewById<TextView>(R.id.txtProgramacao)
        val txtBancoDados = findViewById<TextView>(R.id.txtBancoDados)
        val txtEngenharia = findViewById<TextView>(R.id.txtEngenharia)
        val txtDesenvolvimentoWeb = findViewById<TextView>(R.id.txtDesenvolvimentoWeb)
        val txtDesenvolvimentoMobile = findViewById<TextView>(R.id.txtDesenvolvimentoMobile)
        val txtInteligenciaArtificial = findViewById<TextView>(R.id.txtInteligenciaArtificial)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        txtProgramacao.setOnClickListener {
            val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
            intent.putExtra("DISCIPLINA", "Programação")
            startActivity(intent)
        }

        txtBancoDados.setOnClickListener {
            val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
            intent.putExtra("DISCIPLINA", "Banco de Dados")
            startActivity(intent)
        }

        txtEngenharia.setOnClickListener {
            val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
            intent.putExtra("DISCIPLINA", "Engenharia de Software")
            startActivity(intent)
        }

        txtDesenvolvimentoWeb.setOnClickListener {
            val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
            intent.putExtra("DISCIPLINA", "Desenvolvimento Web")
            startActivity(intent)
        }

        txtDesenvolvimentoMobile.setOnClickListener {
            val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
            intent.putExtra("DISCIPLINA", "Desenvolvimento Mobile")
            startActivity(intent)
        }

        txtInteligenciaArtificial.setOnClickListener {
            val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
            intent.putExtra("DISCIPLINA", "Inteligência Artificial")
            startActivity(intent)
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}