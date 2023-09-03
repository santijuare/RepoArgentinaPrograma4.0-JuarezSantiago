package com.example.argentinaprograma40

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val buttonCompare = findViewById<Button>(R.id.buttonCompare)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonCompare.setOnClickListener {
            val phrase1 = editText1.text.toString()
            val phrase2 = editText2.text.toString()

            val result = if (phrase1 == phrase2) {
                "Las frases que ingresó son iguales."
            } else {
                "Las frases que ingresó son diferentes."
            }

            textResult.text = result
        }
    }
}