package com.example.android.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener{
            setNickname(it)
        }
    }

    private fun setNickname(view: View) {
        val nicknameEdit : EditText = findViewById(R.id.nickname_input)
        val nicknameText : TextView = findViewById(R.id.nickname_text)
        val nicknameButton : Button = findViewById(R.id.done_button)
        nicknameText.text = nicknameEdit.text
        nicknameText.visibility = View.VISIBLE
        nicknameButton.visibility = View.GONE
        nicknameEdit.visibility = View.GONE
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }


}