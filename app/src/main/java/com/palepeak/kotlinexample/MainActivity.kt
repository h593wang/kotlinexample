package com.palepeak.kotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = listOf(1,2,3,null,4)

        textView.text = data.processData().toString()
    }

    fun List<Int?>.processData() = map { item ->
        item?.let { it + 1 }
    }
}