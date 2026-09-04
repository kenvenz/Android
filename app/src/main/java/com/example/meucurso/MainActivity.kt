package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnConheca = findViewById<Button>(R.id.btnConheca)
        val btnDisciplinas = findViewById<Button>(R.id.btnDisciplinas)

        btnConheca.setOnClickListener {
            startActivity(Intent(this, SobreCursoActivity::class.java))
        }

        btnDisciplinas.setOnClickListener {
            startActivity(Intent(this, DisciplinasActivity::class.java))
        }
    }
}

