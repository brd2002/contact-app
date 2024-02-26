package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactapp.databinding.ActivityMain2Binding
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.fragment.OneFragment
import com.example.contactapp.fragment.ThreeFragment
import com.example.contactapp.fragment.TwoFragment

class MainActivity2 : AppCompatActivity() {
    lateinit var  binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.one.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView,OneFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.two.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, TwoFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.three.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView,ThreeFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}