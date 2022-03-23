package com.example.dotaheroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dotaheroes.databinding.ActivityMainBinding

class HeroesAdapter(val heroesNames: List<String>, val heroesDescriptions: List<String>, val heroesIcons: List<Int>) :
RecyclerView.Adapter<HeroesAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val heroIcon: ImageView = itemView.findViewById(R.id.hero_icon)
        val heroName: TextView = itemView.findViewById(R.id.hero_name)
        val heroDescription: TextView = itemView.findViewById(R.id.hero_description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view =LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.heroName.text = heroesNames[position]
        holder.heroDescription.text = heroesDescriptions[position]
        holder.heroIcon.setImageResource(heroesIcons[position])
    }

    override fun getItemCount(): Int {
        return heroesNames.size
    }
}