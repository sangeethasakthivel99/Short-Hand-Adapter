package com.sangeetha.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dummyList: List<String> = listOf("One", "Two", "Three", "Four", "Five")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }

    fun test() {
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = MainActivityAdapter(R.layout.layout_item, dummyList)
    }
}