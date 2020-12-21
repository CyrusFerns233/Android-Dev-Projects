package com.example.christmasgreetingcard

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_card_screen.*
import org.w3c.dom.Text


class CardScreenActivity : AppCompatActivity() {

    companion object{

        const val NAME_EXTRA="name_extra"

    }

    @SuppressLint("WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_screen)

        val name= intent.getStringExtra(NAME_EXTRA)

        greet.text = "Wishing You A Merry Christmas \n\n$name "

    }
}


