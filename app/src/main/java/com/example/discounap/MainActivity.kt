package com.example.discounap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.discounap.activity.RegistrationActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun login(view: View) {
        if (numberEditText.text.isEmpty()) {
            Toast.makeText(this, "No number entered!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "${numberEditText.text}", Toast.LENGTH_SHORT).show()
        }
    }

    fun register(view: View){
        val regActivityIntent = Intent(this, RegistrationActivity::class.java)
        startActivity(regActivityIntent)
    }

}