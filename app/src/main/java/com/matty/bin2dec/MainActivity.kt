package com.matty.bin2dec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button1);
        val textField = findViewById<EditText>(R.id.textView2);
        button?.setOnClickListener(){
            Toast.makeText(this@MainActivity, textField.text.toString(), Toast.LENGTH_SHORT).show();
        }
        textField.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s != null) {
                    Toast.makeText(this@MainActivity, s[s.length-1].toString(), Toast.LENGTH_SHORT).show()
                };
            }
        })
    }
}