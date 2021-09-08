package com.example.recylcerviewpicasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*
import org.w3c.dom.Text

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        var name: TextView = findViewById(R.id.tvdetailed)
        var image: ImageView = findViewById(R.id.ivdetailed)
        var ocjena: TextView = findViewById(R.id.vrijednost2)



        val bundle: Bundle? = intent.extras
        val ime = bundle!!.getString("superHeroName")
        val slika = bundle.getString("image")
        val broj = bundle.getInt("vrijednost")

        name.text = ime
        Glide.with(this).load(slika).into(image)

        ocjena.text = uvecajbroj(broj).toString()


    }

    fun uvecajbroj(broj: Int): Int{
        val rezultat = broj*5
        return rezultat
    }
}


