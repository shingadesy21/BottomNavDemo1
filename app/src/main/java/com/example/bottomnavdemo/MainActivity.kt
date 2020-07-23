package com.example.bottomnavdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        floatingActionButton.setOnClickListener{
            Toast.makeText(applicationContext,"You Clicked FloatingActionButton",Toast.LENGTH_SHORT).show()
        }
        textview.text="Home Tab"
        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->
                {
                    textview.text="Home Tab"
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.profile->{
                    textview.text="Profile Tab"
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.search->{
                    textview.text="Search Tab"
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.like->{
                    textview.text="Like Tab"
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}