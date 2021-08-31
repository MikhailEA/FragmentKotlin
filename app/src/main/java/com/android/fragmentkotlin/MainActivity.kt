package com.android.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firsFragment = FirsFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firsFragment)
            commit()
        }

        btnFragment1.setOnclickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firsFragment)
                commit()
            }
        }

    }
}