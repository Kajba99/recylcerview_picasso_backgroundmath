package com.example.recylcerviewpicasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        var name: TextView = findViewById(R.id.tvdetailed)
        var image: ImageView = findViewById(R.id.ivdetailed)



        val bundle: Bundle? = intent.extras
        val ime = bundle!!.getString("superHeroName")
        val slika = bundle.getInt("image")

        name.text = ime
        image.setImageResource(slika)


    }
}


