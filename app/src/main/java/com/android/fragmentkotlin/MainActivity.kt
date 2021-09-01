package com.android.fragmentkotlin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnFragment1 = findViewById<Button>(R.id.btnFragment1)
        var btnFragment2 = findViewById<Button>(R.id.btnFragment2)

        val firsFragment = FirsFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firsFragment)
            addToBackStack(null)
            commit()
        }


        btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firsFragment)
                commit()
            }
        }

        btnFragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()
            }
        }






    }
}