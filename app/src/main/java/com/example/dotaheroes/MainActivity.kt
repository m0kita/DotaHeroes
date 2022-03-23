package com.example.dotaheroes

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dotaheroes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val heroIconList = mutableListOf<Int>(R.drawable.pudge, R.drawable.techies, R.drawable.anti_mage, R.drawable.spirit_breaker, R.drawable.viper, R.drawable.enchantress, R.drawable.abaddon)

        binding.recyclerView.adapter = HeroesAdapter(getHeroesNames(), getHeroesDescription(), heroIconList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
    private fun getHeroesNames(): List<String> {
        return this.resources.getStringArray(R.array.heroesNames).toList()
    }
    private fun getHeroesDescription(): List<String> {
        return this.resources.getStringArray(R.array.heroesDescriptions).toList()
    }
}