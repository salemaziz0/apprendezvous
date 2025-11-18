package com.example.apprendezvous

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apprendezvous.R

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)

        // Ajuster l'affichage pour les barres système
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Trouver le TextView (bouton) et définir l'événement de clic
        val bt1 = findViewById<TextView>(R.id.bt1)
        bt1.setOnClickListener {
            // Créer l'intention pour démarrer Page3
            val intent = Intent(this, Page3::class.java)
            startActivity(intent)  // Démarrer l'activité Page3
        }
    }
}
