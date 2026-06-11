package br.gov.sp.etec.startapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PainelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_painel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnVagasOcupadas = findViewById<Button>(R.id.btnVagasOcupadas)
        val intentVagasOcupadas = Intent(this, VagasOcupadasActivity::class.java)
        btnVagasOcupadas.setOnClickListener{
            startActivity(intentVagasOcupadas)
        }

        val btnVagasLivres = findViewById<Button>(R.id.btnVagasLivres)
        val intentVagasLivres = Intent(this, VagasLivresActivity::class.java)
        btnVagasLivres.setOnClickListener{
            startActivity(intentVagasLivres)
        }

        val btnEntrada = findViewById<Button>(R.id.btnEntrada)
        val intentEntrada = Intent(this, EntradaActivity::class.java)
        btnEntrada.setOnClickListener{
            startActivity(intentEntrada)
        }
        val btnSaida = findViewById<Button>(R.id.btnSaida)
        val intentSaida = Intent(this, SaidaActivity::class.java)
        btnSaida.setOnClickListener{
            startActivity(intentSaida)
        }

        val btnHistorico = findViewById<Button>(R.id.btnHistorico)
        val intentHistorico = Intent(this, HistoricoActivity::class.java)
        btnHistorico.setOnClickListener{
            startActivity(intentHistorico)
        }
    }
}