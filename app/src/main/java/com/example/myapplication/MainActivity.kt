package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)

        list = ArrayList()
        list.add(Info(R.drawable.fe170e4457ecebe6a3f416d7045b06d2,"Peperoni"))
        list.add(Info(R.drawable.df43c1694ed754745edfab74549281c8,"ChetyreSezona"))
        list.add(Info(R.drawable.fe170e4457ecebe6a3f416d7045b06d2,"Mocarella"))
        list.add(Info(R.drawable.df43c1694ed754745edfab74549281c8,"S Syrom"))
        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}