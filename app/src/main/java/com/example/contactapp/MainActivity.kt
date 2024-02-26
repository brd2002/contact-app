package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var datalist = ArrayList<Model>()
        datalist.add(Model(R.drawable.a , R.drawable.user1 , "My name is bharat"))
        datalist.add(Model(R.drawable.b , R.drawable.user2 , "My name is Kisan"))
        datalist.add(Model(R.drawable.c , R.drawable.user3 , "My name is Kuntal"))
        var adapter = Adapter(datalist)
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = adapter
    }
}