package com.example.christmasgreetingcard

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateCard(view: View) {

        val name=input.editableText.toString()


        val intent = Intent(this,CardScreenActivity::class.java)
        intent.putExtra(CardScreenActivity.NAME_EXTRA,name)

        startActivity(intent)                                                       //from AppCompactActivity


        Toast.makeText( this,"The Name is $name", Toast.LENGTH_SHORT).show()

    }




}