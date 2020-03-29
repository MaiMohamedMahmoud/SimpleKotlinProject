package com.marscode.pwn.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var linearlayoutManager: LinearLayoutManager
    private lateinit var adapter: RecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearlayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearlayoutManager

        var Movies_list = ArrayList<Movie>()
        Movies_list.add(Movie("Raising Arizona", "1987"))
        Movies_list.add(Movie("Vampire's Kiss", "1988"))
        Movies_list.add(Movie("Con Air", "1997"))
        Movies_list.add(Movie("Gone in 60 Seconds", "1997"))
        Movies_list.add(Movie("National Treasure", "2004"))
        Movies_list.add(Movie("The Wicker Man", "2006"))
        Movies_list.add(Movie("Ghost Rider", "2007"))
        Movies_list.add(Movie("Knowing", "2009"))



        adapter = RecycleAdapter(Movies_list,this)
        recyclerView.adapter = adapter


    }
}
