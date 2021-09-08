package com.example.recylcerviewpicasso

import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*

class HeroAdapter(val superhero:List<SuperHero>,private val onClickListener: onClickListener): RecyclerView.Adapter<HeroAdapter.HeroHolder>() {


    class HeroHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun render(superHero: SuperHero){
           view.tvRealName.text = superHero.realName
            view.tvPublisher.text = superHero.publisher
            view.tvSuperHeroName.text = superHero.superHeroName
            view.vrijednost.text = superHero.vrijednost.toString()
            Picasso.get().load(superHero.image).into(view.ivHero)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
      val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])

        holder.itemView.setOnClickListener {
            onClickListener.onItemClicked(position)
        }
    }

    override fun getItemCount(): Int = superhero.size

}