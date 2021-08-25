package com.example.recylcerviewpicasso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), onClickListener {

    val superheros = listOf( SuperHero("Spiderman", "Marvel", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
            SuperHero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
            SuperHero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
            SuperHero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
            SuperHero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"),
            SuperHero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"),
            SuperHero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"),
            SuperHero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // superheros[0].realName = Peter Parker
        recyclerView()

    }

    fun recyclerView() {
        rvSuperHero.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superheros, this)
        rvSuperHero.adapter = adapter
        adapter.notifyDataSetChanged()

    }

    override fun onItemClicked(postion: Int) {
        val intent = Intent(this, DetailedActivity::class.java)
        intent.putExtra("superHeroName", superheros[postion].superHeroName)
        intent.putExtra("image", superheros[postion].image)
        startActivity(intent)
    }

}