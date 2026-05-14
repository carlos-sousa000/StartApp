package br.gov.sp.etec.startapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent = Intent(this, PainelActivity::class.java)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val editTextEmailLogin = findViewById<EditText>(R.id.editTextEmailLogin)
        val editTextSenhaLogin = findViewById<EditText>(R.id.editTextSenhaLogin)
        btnLogin.setOnClickListener {
            if(editTextEmailLogin.text.isEmpty() || editTextSenhaLogin.text.isEmpty()){
                Toast.makeText(this, "Parece que você esqueceu de digitar algo", Toast.LENGTH_LONG).show()
            }else{
                if (editTextEmailLogin.text.toString().equals("carlos@email.com") && editTextSenhaLogin.text.toString().equals("123")){
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Usuário ou senha inválida", Toast.LENGTH_LONG).show()
                }

            }
        }


        val intentCadastro = Intent(this, CadastroActivity::class.java)
        val btnCadastro = findViewById<Button>(R.id.btnCadastro)
        btnCadastro.setOnClickListener {
            startActivity(intentCadastro)
        }
    }
}