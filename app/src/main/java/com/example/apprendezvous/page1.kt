package com.example.apprendezvous

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apprendezvous.R

class SplashLogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Active le mode Edge-to-Edge si tu l'as défini
        enableEdgeToEdge()

        // Définit le layout de l'activité avec un fichier XML (activity_splash_logo.xml)
        setContentView(R.layout.activity_splashlogo)

        // Ajuste les marges pour les barres système comme la barre de statut et la barre de navigation
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets // Retourne les insets modifiés
        }

        // Après un délai de 3 secondes (3000ms), lance l'activité suivante (Page2)
        Handler().postDelayed({
            val intent = Intent(this, Page2::class.java)  // Crée une intention pour démarrer Page2
            startActivity(intent)  // Démarre l'activité Page2
            finish()  // Termine SplashLogo pour ne pas pouvoir revenir en arrière
        }, 3000)  // Délai de 3 secondes
    }
}

