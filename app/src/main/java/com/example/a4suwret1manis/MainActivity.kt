package com.example.a4suwret1manis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4suwret1manis.databinding.ActivityGameBinding
import com.example.a4suwret1manis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnPlay.setOnClickListener {
                val intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
            }
        }
    }
}