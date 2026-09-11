package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesDisciplinaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_disciplina)

        val nomeDisciplina = intent.getStringExtra("DISCIPLINA")

        val txtNomeDisciplina = findViewById<TextView>(R.id.txtNomeDisciplina)
        val txtCargaHoraria = findViewById<TextView>(R.id.txtCargaHoraria)
        val txtModalidade = findViewById<TextView>(R.id.txtModalidade)
        val txtProfessor = findViewById<TextView>(R.id.txtProfessor)
        val txtNivel = findViewById<TextView>(R.id.txtNivel)
        val txtDescricao = findViewById<TextView>(R.id.txtDescricao)
        val btnCompartilhar = findViewById<Button>(R.id.btnCompartilhar)
        val btnVoltar = findViewById<Button>(R.id.btnVoltarDetalhes)

        txtNomeDisciplina.text = nomeDisciplina

        when (nomeDisciplina) {
            "Programação" -> {
                txtCargaHoraria.text = "Carga horária: 80 horas"
                txtModalidade.text = "Modalidade: Presencial"
                txtProfessor.text = "Professor: megumi"
                txtNivel.text = "Nível: Grau 1"
                txtDescricao.text = "Descrição: Nesta disciplina são estudados conceitos de programação e desenvolvimento de algoritmos."
            }

            "Banco de Dados" -> {
                txtCargaHoraria.text = "Carga horária: 80 horas"
                txtModalidade.text = "Modalidade: Presencial"
                txtProfessor.text = "Professor: itadori"
                txtNivel.text = "Nível: Grau Especial"
                txtDescricao.text = "Descrição: Nesta disciplina são estudados conceitos de bancos de dados e armazenamento de informações."
            }

            "Engenharia de Software" -> {
                txtCargaHoraria.text = "Carga horária: 80 horas"
                txtModalidade.text = "Modalidade: Presencial"
                txtProfessor.text = "Professor: Nobara"
                txtNivel.text = "Nível: Grau 1"
                txtDescricao.text = "Descrição: Nesta disciplina são estudados conceitos relacionados ao desenvolvimento e organização de sistemas."
            }

            "Desenvolvimento Web" -> {
                txtCargaHoraria.text = "Carga horária: 80 horas"
                txtModalidade.text = "Modalidade: Presencial"
                txtProfessor.text = "Professor: Mai"
                txtNivel.text = "Nível: Grau 3"
                txtDescricao.text = "Descrição: Nesta disciplina são estudados conceitos relacionados ao desenvolvimento de aplicações para a Web."
            }

            "Desenvolvimento Mobile" -> {
                txtCargaHoraria.text = "Carga horária: 80 horas"
                txtModalidade.text = "Modalidade: Presencial"
                txtProfessor.text = "Professor: sukuna"
                txtNivel.text = "Nível: Grau Especial "
                txtDescricao.text = "Descrição: Nesta disciplina são estudados conceitos relacionados ao desenvolvimento de aplicativos mobile."
            }

            "Inteligência Artificial" -> {
                txtCargaHoraria.text = "Carga horária: 80 horas"
                txtModalidade.text = "Modalidade: Presencial"
                txtProfessor.text = "Professor: Gojo"
                txtNivel.text = "Nível: Divino"
                txtDescricao.text = "Descrição: Nesta disciplina são estudados conceitos relacionados à Inteligência Artificial."
            }
        }

        btnCompartilhar.setOnClickListener {
            val textoCompartilhar = """
                Disciplina: $nomeDisciplina
                ${txtCargaHoraria.text}
                ${txtModalidade.text}
                ${txtProfessor.text}
                ${txtNivel.text}
                ${txtDescricao.text}
            """.trimIndent()

            val intentCompartilhar = Intent(Intent.ACTION_SEND)
            intentCompartilhar.type = "text/plain"
            intentCompartilhar.putExtra(Intent.EXTRA_TEXT, textoCompartilhar)

            startActivity(Intent.createChooser(intentCompartilhar, "Compartilhar disciplina"))
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}